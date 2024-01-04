package com.rafsanjani.behavioral.iterator;

public class ConcreteIterator implements Iterator<String>{

    private String[] array;
    private int currentIndex = 0;

    public ConcreteIterator(String[] array) {
        this.array = array;
    }

    @Override
    public boolean hasNext() {
        return currentIndex < array.length && array[currentIndex] != null;
    }

    @Override
    public String next() {
        return array[currentIndex++];
    }

    @Override
    public void removed() {

        throw new UnsupportedOperationException();
    }
}
