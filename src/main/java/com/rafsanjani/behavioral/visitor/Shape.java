package com.rafsanjani.behavioral.visitor;

public interface Shape {

    void accept(ShapeVisitor visitor);
}
