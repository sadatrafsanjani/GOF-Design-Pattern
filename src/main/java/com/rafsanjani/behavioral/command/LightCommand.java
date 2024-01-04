package com.rafsanjani.behavioral.command;

public class LightCommand implements Command {

    private Light light;

    public LightCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {

        light.toggle();
    }
}
