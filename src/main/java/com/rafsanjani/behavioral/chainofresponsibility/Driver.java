package com.rafsanjani.behavioral.chainofresponsibility;

public class Driver {

    public static void main(String[] args) {

        System.out.println("Chain of Responsibility");

        Chairman chairman = new Chairman();
        CEO ceo = new CEO();
        Manager manager = new Manager();

        chairman.setSuccessor(ceo);
        ceo.setSuccessor(manager);

        Request cash = new Request(RequestType.CASH);
        Request cheque = new Request(RequestType.CHEQUE);
        Request draft = new Request(RequestType.DRAFT);

        chairman.handleRequest(cash);
        chairman.handleRequest(cheque);
        chairman.handleRequest(draft);
    }
}
