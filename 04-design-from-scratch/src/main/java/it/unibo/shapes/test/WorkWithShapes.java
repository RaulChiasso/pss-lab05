package it.unibo.shapes.test;

import it.unibo.shapes.impl.Circle;
import it.unibo.shapes.impl.Rectangle;
import it.unibo.shapes.impl.Square;
import it.unibo.shapes.impl.Triangle;

public class WorkWithShapes {

    public static void main(String[] args) {
        
        Circle circle = new Circle(2.3);
        Square square = new Square(4);
        Rectangle rectangle = new Rectangle(2.5, 1.2);
        Triangle triangle = new Triangle(5, 3.3);

        System.out.println("Circle area: "+circle.area());
        System.out.println("Circle perimeter: "+circle.perimeter());

        System.out.println("Square area: "+square.area());
        System.out.println("Square perimeter: "+square.perimeter());

        System.out.println("Rectangle area: "+rectangle.area());
        System.out.println("Rectangle perimeter: "+rectangle.perimeter());

        System.out.println("Triangle area: "+triangle.area());
        System.out.println("Triangle perimeter: "+triangle.perimeter());
    }
    
}
