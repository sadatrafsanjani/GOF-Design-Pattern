package com.rafsanjani.behavioral.command;

import java.util.List;

public class MacroLightCommand implements Command {

    private List<Light> lights;

    public MacroLightCommand(List<Light> lights) {
        this.lights = lights;
    }

    @Override
    public void execute() {

        lights.forEach(light -> {
            if(light.getState()){
                light.toggle();
            }
        });
    }
}
