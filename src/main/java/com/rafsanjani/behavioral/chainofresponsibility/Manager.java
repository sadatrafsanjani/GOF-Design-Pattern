package com.rafsanjani.behavioral.chainofresponsibility;

public class Manager extends Handler {

    @Override
    public void handleRequest(Request request) {

        if(request.getRequestType().equals(RequestType.CASH)){

            System.out.println("Manager: I Can process " + RequestType.CASH);
        }
        else{
            successor.handleRequest(request);
        }

    }
}
