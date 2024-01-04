package com.rafsanjani.behavioral.interpreter;

public class Driver {

    public static void main(String[] args) {

        System.out.println("Interpreter");

        Expression expression = new TerminalExpression("Lion");
        String context = "The king of Jungle is Lion";

        System.out.println("Match: Lion - " + expression.interpret(context));
    }
}
