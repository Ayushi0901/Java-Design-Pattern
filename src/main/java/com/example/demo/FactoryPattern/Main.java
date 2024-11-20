package com.example.demo.FactoryPattern;

public class Main {
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();
        Shape shapes = shapeFactory.createShape("CIRCLE");
        shapes.shape();

        shapes = shapeFactory.createShape("SQUARE");
        shapes.shape();
        shapes = shapeFactory.createShape("RECTANGLE");
        shapes.shape();
    }
}


