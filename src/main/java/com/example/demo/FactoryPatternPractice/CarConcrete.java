package com.example.demo.FactoryPatternPractice;

public class CarConcrete {
    static class Nano implements Car {
        public void car() {
            System.out.println("This is my nano");
        }
    }

    static class Suzuki implements Car {
        public void car() {
            System.out.println("this is my suzuki");
        }
    }

    static class Tata implements Car {
        public void car() {
            System.out.println("this is my tata");
        }
    }
}
