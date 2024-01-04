package com.rafsanjani.behavioral.iterator;

public class Driver {

    public static void main(String[] args) {

        System.out.println("Iterator");

        BikeStore store = new BikeStore();
        store.add("Suzuki");
        store.add("Yamaha");
        store.add("Honda");

        Iterator<String> iterator = store.iterator();

        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
