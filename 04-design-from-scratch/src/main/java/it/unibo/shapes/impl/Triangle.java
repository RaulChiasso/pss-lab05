package it.unibo.shapes.impl;

import it.unibo.shapes.api.Polygon;

public class Triangle implements Polygon{

    //Class only for equilateral triangle
    private double side;
    private double height;

    public Triangle(double side, double height) {
        this.side = side;
        this.height = height;
    }

    @Override
    public double area() {
        return (side*height)/2;
    }

    @Override
    public double perimeter() {
        return side*getEdgeCount();
    }

    @Override
    public int getEdgeCount() {
        return 3;
    }
    
}
