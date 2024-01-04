package com.rafsanjani.structural.flyweight;

import java.util.List;
import java.util.UUID;
import java.util.concurrent.CopyOnWriteArrayList;

public class Inventory {

    private ProductFactory factory = ProductFactory.getInstance();
    private List<Order> orders = new CopyOnWriteArrayList<>();

    void orderProduct(String name){

        Product product = factory.search(name);
        orders.add(new Order(UUID.randomUUID().toString().replaceAll("-",""), product));
    }

    void process(){

        orders.forEach(order -> {

            order.processOrder();
            orders.remove(order);
        });
    }

    String report(){

        return "Total item: " + factory.getSize();
    }
}
