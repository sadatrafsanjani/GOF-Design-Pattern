package com.rafsanjani.structural.flyweight;

import java.util.HashMap;
import java.util.Map;

public class ProductFactory {

    public static ProductFactory getInstance(){

        return new ProductFactory();
    }


    private Map<String, Product> caches = new HashMap<>();

    public Product search(String name){

        if(!caches.containsKey(name)){

            caches.put(name, new Product(name));
        }

        return caches.get(name);
    }

    public int getSize(){

        return caches.size();
    }
}
