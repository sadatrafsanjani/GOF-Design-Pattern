package com.rafsanjani.behavioral.visitor;

import java.util.ArrayList;
import java.util.List;

public class Driver {

    public static void main(String[] args) {

        System.out.println("Visitor");

        List<Shape> shapes = new ArrayList<>();

        shapes.add(new Circle(10));
        shapes.add(new Square(10));
        shapes.add(new Square(5));

        AreaVisitor areaVisitor = new AreaVisitor();
        PerimeterVisitor perimeterVisitor = new PerimeterVisitor();

        for (Shape shape: shapes) {
            shape.accept(areaVisitor);
            double area = areaVisitor.get();

            System.out.printf("Area of %s: %.2f%n", shape.getClass().getSimpleName(), area);
        }

        System.out.println("---------------------------------");

        for (Shape shape: shapes) {

            shape.accept(perimeterVisitor);
            double perimeter = perimeterVisitor.get();

            System.out.printf("Perimeter of %s: %.2f%n", shape.getClass().getSimpleName(), perimeter);
        }
    }
}
