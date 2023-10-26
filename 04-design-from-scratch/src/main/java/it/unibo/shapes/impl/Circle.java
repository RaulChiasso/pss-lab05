package it.unibo.shapes.impl;

import it.unibo.shapes.api.Shape;

public class Circle implements Shape{

    private static final double PI = 3.14;

    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return radius*radius*PI;
    }

    @Override
    public double perimeter() {
        return radius*2*PI;
    }
    
}
