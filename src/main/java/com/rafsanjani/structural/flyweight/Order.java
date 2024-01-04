package com.rafsanjani.structural.flyweight;

public class Order {

    private String referenceNo;
    private Product product;

    public Order(String referenceNo, Product product) {
        this.referenceNo = referenceNo;
        this.product = product;
    }

    public void processOrder(){

        System.out.println("Order Ref: " + referenceNo + " Product: " + product.getName());
    }
}
