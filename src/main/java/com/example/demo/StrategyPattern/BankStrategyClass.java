package com.example.demo.StrategyPattern;

public class BankStrategyClass {
    private Bank bank;

    public void setBankType(Bank bank) {
        this.bank = bank;
    }

    public void checkBankType(String type) {
        bank.bank(type);

    }

    public void saving(int amount) {
        bank.saving(amount);
    }
}
