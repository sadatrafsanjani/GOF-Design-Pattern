package com.rafsanjani.behavioral.visitor;

public class PerimeterVisitor implements ShapeVisitor {
    private double perimeter;

    @Override
    public void visit(Circle circle) {
        perimeter = 2 * Math.PI * circle.getRadius();
    }

    @Override
    public void visit(Square square) {
        perimeter = 4 * square.getLength();
    }

    public double get() {
        return this.perimeter;
    }
}
