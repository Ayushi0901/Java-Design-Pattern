package com.example.demo.FactoryPatternPractice;

public class CarMain {
    public static void main(String[] args) {
        CarFactoryClass carFactoryClass = new CarFactoryClass();
        Car car = carFactoryClass.createCar("Nano");
        car.car();
        Car car1 = carFactoryClass.createCar("Suzuki");
        car1.car();
    }
}
