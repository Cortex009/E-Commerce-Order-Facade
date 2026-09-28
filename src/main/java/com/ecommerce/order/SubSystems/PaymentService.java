package com.ecommerce.order.SubSystems;

public class PaymentService {
    public boolean processPayment(String customer, double amount) {
        System.out.println("[Payment] Processing ₹" + amount + " for " + customer);
        return true; // Simplified — always succeeds for demo
    }

    public void refund(String customer, double amount) {
        System.out.println("[Payment] Refunding ₹" + amount + " to " + customer);
    }
}
