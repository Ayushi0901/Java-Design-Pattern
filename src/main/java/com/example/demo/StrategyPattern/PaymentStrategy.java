package com.example.demo.StrategyPattern;

public interface PaymentStrategy {
    void pay(int amount);
    void credit(String name);
}
