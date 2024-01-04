package com.rafsanjani.structural.flyweight;


public class Driver {

    public static void main(String[] args) {

        System.out.println("Flyweight");

        Inventory inventory = new Inventory();
        inventory.orderProduct("Jeans");
        inventory.orderProduct("Jeans");
        inventory.orderProduct("T-shirt");
        inventory.orderProduct("T-shirt");
        inventory.orderProduct("Jeans");

        inventory.process();

        System.out.println(inventory.report());
    }
}
