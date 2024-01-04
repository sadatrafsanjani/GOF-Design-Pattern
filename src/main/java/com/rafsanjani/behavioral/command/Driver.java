package com.rafsanjani.behavioral.command;

import java.util.ArrayList;
import java.util.List;

public class Driver {

    public static void main(String[] args) {

        System.out.println("Command");

        Light kitchenLight = new Light();
        Light bedroomLight = new Light();
        Remote remote = new Remote();

        Command lightCommand = new LightCommand(kitchenLight);
        remote.executeCommand(lightCommand);
        remote.executeCommand(lightCommand);

        List<Light> lights = new ArrayList<>();
        lights.add(kitchenLight);
        lights.add(bedroomLight);

        Command macroLightCommand = new MacroLightCommand(lights);
        remote.executeCommand(macroLightCommand);
    }
}
