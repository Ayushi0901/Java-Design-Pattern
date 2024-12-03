package com.example.demo.FactoryPatternPractice;

public class CarFactoryClass {
    public Car createCar(String type) {
        if (type.equalsIgnoreCase("Nano")) {
            return new CarConcrete.Nano();
        } else if (type.equalsIgnoreCase("Suzuki")) {
            return new CarConcrete.Suzuki();
        } else if (type.equalsIgnoreCase("Tata")) {
            return new CarConcrete.Tata();
        } else {
            throw new IllegalArgumentException("No Car found");
        }
    }
}
