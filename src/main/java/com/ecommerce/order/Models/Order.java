package com.ecommerce.order.Models;

public class Order {
    private final String item;
    private final double price;
    private final String customer;

    public Order(String item, double price, String customer) {
        this.item = item;
        this.price = price;
        this.customer = customer;
    }

    public String getItem() { return item; }
    public double getPrice() { return price; }
    public String getCustomer() { return customer; }
}