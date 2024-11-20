package com.example.demo.FactoryPattern;

public class ShapeFactory {
    public Shape createShape(String type) {
        if (type.equalsIgnoreCase("CIRCLE")) {
            return new ShapeConcreteClass.Circle();
        } else if (type.equalsIgnoreCase("SQUARE")) {
            return new ShapeConcreteClass.Square();
        } else if (type.equalsIgnoreCase("RECTANGLE")) {
            return new ShapeConcreteClass.Rectangle();
        } else {
            throw new IllegalArgumentException("Unknown Shape");
        }
    }
}
