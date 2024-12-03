package com.example.demo.FactoryPattern;

public class AnimalfactoryClass {
    public Animal createAnimal(String type) {
        if (type.equalsIgnoreCase("GOAT")) {
            return new AnimalConcreteClass.Goat();
        } else if (type.equalsIgnoreCase("PIG")) {
            return new AnimalConcreteClass.Pig();
        } else {
            throw new IllegalArgumentException("Not found");
        }
    }
}
