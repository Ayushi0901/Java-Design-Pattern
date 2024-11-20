package com.example.demo.SOLID;
public class OrderServiceWithSave {
    private PaymentProcessor paymentProcessor;
    private OrderSaver orderSaver;

    public OrderServiceWithSave(PaymentProcessor paymentProcessor, OrderSaver orderSaver) {
        this.paymentProcessor = paymentProcessor;
        this.orderSaver = orderSaver;
    }

     void processAndSaveOrder(Order order) {
        paymentProcessor.processPayment(order);
        orderSaver.saveOrder(order);
        System.out.println("Order " + order.getOrderId() + " processed and saved successfully.");
    }
}


