package com.rafsanjani.behavioral.iterator;

public interface Iterator<Object> {

    boolean hasNext();

    String next();

    void removed();
}
