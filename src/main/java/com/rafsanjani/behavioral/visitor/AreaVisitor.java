package com.rafsanjani.behavioral.visitor;

public class AreaVisitor implements ShapeVisitor {
    private double area;

    @Override
    public void visit(Circle circle) {
        area = Math.PI * Math.pow(circle.getRadius(), 2);
    }

    @Override
    public void visit(final Square square) {
        area = 2 * square.getLength();
    }

    public double get() {
        return this.area;
    }
}
