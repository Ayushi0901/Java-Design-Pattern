package com.example.demo.StrategyPattern;

public class Main {
    public static void main(String[] args) {
        BankStrategyClass bankStrategyClass = new BankStrategyClass();

        bankStrategyClass.setBankType(new BankConcreteClass.ICICI());
        bankStrategyClass.saving(90000);
        bankStrategyClass.checkBankType("saving");


        bankStrategyClass.setBankType(new BankConcreteClass.SBI());
        bankStrategyClass.saving(90000000);
        bankStrategyClass.checkBankType("salary");

    }
}
