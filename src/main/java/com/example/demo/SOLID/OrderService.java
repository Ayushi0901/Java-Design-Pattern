package com.example.demo.SOLID;

public class OrderService {
    /*
     Liskov Substitution Principle (LSP)
Objects of a superclass should be replaceable with objects of a subclass without affecting the correctness of the program.

The Liskov Substitution Principle ensures that a subclass can
stand in for a superclass without altering the desired behavior.
     */
    private PaymentProcessor paymentProcessor;

     OrderService(PaymentProcessor paymentProcessor) {
        this.paymentProcessor = paymentProcessor;
    }

    public void processOrder(Order order) {
        paymentProcessor.processPayment(order);
        System.out.println("order" + order.getOrderId() + "processed successfully");
    }
}

