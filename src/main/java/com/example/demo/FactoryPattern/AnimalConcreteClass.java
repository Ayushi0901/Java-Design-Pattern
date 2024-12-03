package com.example.demo.FactoryPattern;

public class AnimalConcreteClass {
    static class Pig implements Animal {
        @Override
        public void animal() {
            System.out.println("This is pig");
        }
    }

    static class Goat implements Animal {
        @Override
        public void animal() {
            System.out.println("this is goat");
        }
    }
}
