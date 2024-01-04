package com.rafsanjani.behavioral.iterator;

public class BikeStore {

    private String[] bikes;
    private int index;

    public BikeStore() {
        this.bikes = new String[2];
        this.index = 0;
    }

    public void add(String bike){

        if(index == bikes.length){

            String[] temp = new String[bikes.length + 2];
            System.arraycopy(bikes, 0, temp, 0, bikes.length);
            bikes = temp;
            temp = null;
        }

        bikes[index++] = bike;
    }

    public Iterator<String> iterator(){

        return new ConcreteIterator(bikes);
    }
}
