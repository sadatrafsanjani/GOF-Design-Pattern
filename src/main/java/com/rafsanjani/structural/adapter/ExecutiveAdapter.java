package com.rafsanjani.structural.adapter;

public class ExecutiveAdapter implements Employee{

    private Executive instance;

    public ExecutiveAdapter(Executive instance) {
        this.instance = instance;
    }

    @Override
    public String getFirstName() {
        return instance.getName().substring(0, instance.getName().indexOf(" "));
    }

    @Override
    public String getLastName() {
        return instance.getName().substring(instance.getName().indexOf(" ")+1);
    }

    @Override
    public String toString() {
        return "Executive{" +
                "firstName='" + instance.getName().substring(0, instance.getName().indexOf(" ")) + '\'' +
                ", lastName='" + instance.getName().substring(instance.getName().indexOf(" ")+1) + '\'' +
                '}';
    }
}
