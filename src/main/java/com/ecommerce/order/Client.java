package com.ecommerce.order;

import com.ecommerce.order.Models.Order;
import com.ecommerce.order.SubSystems.*;


public class Client {
    public static void main(String[] args) {
        AnalyticsService analytics = new AnalyticsService();
        InventoryService inventory = new InventoryService();
        LogisticsService logistics = new LogisticsService();
        NotificationService notification = new NotificationService();
        PaymentService payment = new PaymentService();

        OrderFacade orderFacade = new OrderFacade(
                analytics, inventory, logistics, notification, payment
        );

        OrderController controller = new OrderController(orderFacade);

        Order myOrder = new Order("Wireless Noise-Cancelling Headphones", 299.99, "Alex Carter");

        controller.placeOrder(myOrder);
        System.out.println("--------------------------------------------------");
        controller.cancelOrder(myOrder);
    }
}
