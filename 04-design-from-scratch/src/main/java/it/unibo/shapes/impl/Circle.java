package it.unibo.shapes.impl;

import it.unibo.shapes.api.Shape;
import java.lang.Math;

public class Circle implements Shape{

    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return radius*radius*Math.PI;
    }

    @Override
    public double perimeter() {
        return radius*2*Math.PI;
    }
    
}
