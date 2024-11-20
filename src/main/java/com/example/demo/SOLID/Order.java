package com.example.demo.SOLID;

public class Order {
    //Single Responsibility
    /*
    A class should have one and only one reason to change.
     */
    private String orderId;
    private double amount;

    public String getOrderId() {
        return orderId;
    }

    public double getAmount() {
        return amount;
    }

    public Order(String orderId, double amount) {
        this.orderId = orderId;
        this.amount = amount;

    }

}
