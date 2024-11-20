package com.example.demo.StrategyPattern;
import com.example.demo.StrategyPattern.PaymentConcreteStrategy.CreditCardPayment;

public class Main {
    public static void main(String[] args) {
        ShoppingCartContext shoppingCart = new ShoppingCartContext();
        //set amount n name
        shoppingCart.setPaymentStrategy(new CreditCardPayment());
        shoppingCart.checkOut(90000);
        shoppingCart.creditorName("Ayushi");

        //set amount n name
        shoppingCart.setPaymentStrategy(new PaymentConcreteStrategy.MasterCardPayment());
        shoppingCart.checkOut(90000);
        shoppingCart.creditorName("Riya");
        //set amount n name
        shoppingCart.setPaymentStrategy(new PaymentConcreteStrategy.PayPalPayment());
        shoppingCart.checkOut(90000);
        shoppingCart.creditorName("Arushi");
    }
}
