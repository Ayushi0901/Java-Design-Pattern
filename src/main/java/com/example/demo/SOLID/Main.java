package com.example.demo.SOLID;

public class Main {
    public static void main(String[] args){
        Order order = new Order("789", 29.99);
        // Choosing a payment method (PayPal in this case)
        PaymentProcessor paymentProcessor = new PayPalPaymentProcessor() ;

        OrderSaver orderSaver = new DatabaseOrderSaver();

        // Creating the OrderService and processing the order
        OrderServiceWithSave orderService = new OrderServiceWithSave( paymentProcessor,orderSaver);
        orderService.processAndSaveOrder(order);}
}
