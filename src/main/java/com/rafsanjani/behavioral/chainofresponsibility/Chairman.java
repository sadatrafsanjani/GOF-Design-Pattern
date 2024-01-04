package com.rafsanjani.behavioral.chainofresponsibility;

public class Chairman extends Handler {

    @Override
    public void handleRequest(Request request) {

        if(request.getRequestType().equals(RequestType.DRAFT)){

            System.out.println("Chairman: I Can process " + RequestType.DRAFT);
        }
        else{
            successor.handleRequest(request);
        }
    }
}
