package com.rafsanjani.behavioral.command;

public class Remote {

    public void executeCommand(Command command){

        command.execute();
    }
}
