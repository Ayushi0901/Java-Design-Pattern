package com.example.demo.StrategyPattern;

public class BankConcreteClass {
    static class ICICI implements Bank {
        public void bank(String type) {
            System.out.println("this is  bank" +type);
        }

        public void saving(int amount) {
            System.out.println("ICICI" + amount);
        }
    }

    static class SBI implements Bank {
        public void bank(String type) {
            System.out.println("this is  bank" +type );
        }

        public void saving(int amount) {
            System.out.println("SBI" + amount);
        }
    }

    static class Canera implements Bank {
        public void bank(String type) {
            System.out.println("this is Canera bank" +type);
        }

        public void saving(int amount) {
            System.out.println("Canera" + amount);
        }
    }

}
