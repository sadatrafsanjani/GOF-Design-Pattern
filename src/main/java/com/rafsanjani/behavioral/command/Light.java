package com.rafsanjani.behavioral.command;

public class Light {

    private boolean state;

    public void toggle(){

        state = !state;

        System.out.println(state ? "ON" : "OFF");
    }

    public boolean getState(){

        return state;
    }

}
