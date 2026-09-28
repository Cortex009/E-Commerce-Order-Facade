package com.ecommerce.order;

import com.ecommerce.order.Models.Order;
import com.ecommerce.order.SubSystems.*;


/**
 * Orchestrates the checkout workflow by integrating inventory, payment, and logistics.
 */
public class OrderFacade {
    private final AnalyticsService analyticsService;
    private final InventoryService inventoryService;
    private final LogisticsService logisticsService;
    private final NotificationService notificationService;
    private final PaymentService paymentService;

    public OrderFacade(AnalyticsService analyticsService,
                       InventoryService inventoryService,
                       LogisticsService logisticsService,
                       NotificationService notificationService,
                       PaymentService paymentService) {
        this.analyticsService = analyticsService;
        this.inventoryService = inventoryService;
        this.logisticsService = logisticsService;
        this.notificationService = notificationService;
        this.paymentService = paymentService;
    }
    public void processOrder(Order order) {
        System.out.println("--- Starting Order Process for: " + order.getItem() + " ---");

        if (inventoryService.checkStock(order.getItem())) {
            if (paymentService.processPayment(order.getCustomer(), order.getPrice())) {
                inventoryService.reduceStock(order.getItem(), 1);
                logisticsService.scheduleDelivery(order.getItem(), order.getCustomer());

                notificationService.notifySeller(order.getItem(), order.getCustomer());
                notificationService.sendConfirmation(order.getCustomer(), order.getItem());

                analyticsService.recordSale(order.getItem(), order.getPrice());

                System.out.println("--- Order Processed Successfully ---\n");
            }
        }
    }

    public void cancelOrder(Order order) {
        System.out.println("--- Starting Order Cancellation for: " + order.getItem() + " ---");

        paymentService.refund(order.getCustomer(), order.getPrice());
        inventoryService.restoreStock(order.getItem(), 1);
        logisticsService.cancelDelivery(order.getItem(), order.getCustomer());
        notificationService.sendCancellation(order.getCustomer(), order.getItem());
        analyticsService.recordCancellation(order.getItem(), order.getPrice());

        System.out.println("--- Order Cancelled Successfully ---\n");
    }
}
