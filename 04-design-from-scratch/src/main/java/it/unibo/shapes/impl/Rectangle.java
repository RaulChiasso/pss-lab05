package it.unibo.shapes.impl;

import it.unibo.shapes.api.Polygon;

public class Rectangle implements Polygon{

    private double side1;
    private double side2;

    public Rectangle(double side1, double side2) {
        this.side1 = side1;
        this.side2 = side2;
    }

    @Override
    public double area() {
        return side1*side2;
    }

    @Override
    public double perimeter() {
        return side1*2+side2*2;
    }

    @Override
    public int getEdgeCount() {
        return 4;
    }
    
}
