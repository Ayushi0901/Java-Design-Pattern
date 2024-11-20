package com.example.demo.StrategyPattern;

public class ShoppingCartContext {
    private PaymentStrategy paymentStrategy;
    public void setPaymentStrategy(PaymentStrategy paymentStrategy){
        this.paymentStrategy=paymentStrategy;
    }
    public void checkOut(int amount){
        paymentStrategy.pay(amount);
    }
    public void creditorName(String name){
        paymentStrategy.credit(name);
    }
}
