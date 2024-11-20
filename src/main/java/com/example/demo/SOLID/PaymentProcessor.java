package com.example.demo.SOLID;

/**
 * The type Payment processor.
 */
public interface PaymentProcessor {
   void processPayment(Order order);
 }
    /*
     Open/Closed Principle (OCP)
Software entities (classes, modules, functions, etc.)
should be open for extension,
but closed for modification.
     */


     class CreditCardProcessor implements PaymentProcessor {
        @Override
        public void processPayment(Order order){
            System.out.println("Processing credit card payment for order "+ order.getOrderId() );
    }


}
 class PayPalPaymentProcessor implements PaymentProcessor{
        @Override
    public void processPayment(Order order){
            System.out.println("Processing mastercard card payment for order"+order.getOrderId());
        }
}