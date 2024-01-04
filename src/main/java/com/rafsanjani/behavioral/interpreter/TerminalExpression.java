package com.rafsanjani.behavioral.interpreter;

import java.util.StringTokenizer;

public class TerminalExpression implements Expression {
    private String pattern;

    public TerminalExpression(String pattern) {
        this.pattern = pattern;
    }

    public boolean interpret(String str){

        StringTokenizer stringTokenizer = new StringTokenizer(str);

        while(stringTokenizer.hasMoreTokens()){

            String token = stringTokenizer.nextToken();

            if(token.equals(pattern)){
                return true;
            }
        }

        return false;
    }
}
