package com.example.demo.StrategyPattern;

public class PaymentConcreteStrategy {
    static class CreditCardPayment implements PaymentStrategy {
        public void pay(int amount) {
            System.out.println("Paid " + amount + " using Credit Card.");
        }

        public void credit(String name) {
            System.out.println("CreditCard Creditor Name " + name);
        }
    }

    static class MasterCardPayment implements PaymentStrategy {
        public void pay(int amount) {
            System.out.println("Mastercard paid" + amount);
        }

        public void credit(String name) {
            System.out.println("MasterCard Creditor Name " + name);
        }
    }

    static class PayPalPayment implements PaymentStrategy {
        public void pay(int amount) {
            System.out.println("Paid " + amount + " using PayPal.");
        }

        public void credit(String name) {
            System.out.println("Paypal Creditor Name " + name);
        }
    }

}
