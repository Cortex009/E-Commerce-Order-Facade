package com.ecommerce.order.SubSystems;

public class AnalyticsService {
    public void recordSale(String item, double price) {
        System.out.println("[Analytics] Sale recorded: " + item + " for ₹" + price);
    }

    public void recordCancellation(String item, double price) {
        System.out.println("[Analytics] Cancellation recorded: " + item + " for ₹" + price);
    }
}
