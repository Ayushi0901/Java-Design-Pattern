package com.example.demo.FactoryPattern;

public class ShapeConcreteClass {
    static class Circle implements Shape{
        public void shape(){
            System.out.println("Shape is circle");
        }
    }
    static class Rectangle implements Shape{
        public void shape(){
            System.out.println("Shape is Reactangle");
        }
    }
    static class Square implements Shape{
        public void shape(){
            System.out.println("Shape is SQuare");
        }
    }
}
