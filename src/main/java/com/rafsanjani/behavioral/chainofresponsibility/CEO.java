package com.rafsanjani.behavioral.chainofresponsibility;

public class CEO extends Handler {

    @Override
    public void handleRequest(Request request) {

        if(request.getRequestType().equals(RequestType.CHEQUE)){

            System.out.println("CEO: I Can process " + RequestType.CHEQUE);
        }
        else{
            successor.handleRequest(request);
        }
    }
}
