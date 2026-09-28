package com.ecommerce.order.SubSystems;

public class LogisticsService {
    public void scheduleDelivery(String item, String customer) {
        System.out.println("[Logistics] Delivery scheduled for " + item + " to " + customer);
    }

    public void cancelDelivery(String item, String customer) {
        System.out.println("[Logistics] Delivery cancelled for " + item + " to " + customer);
    }
}
