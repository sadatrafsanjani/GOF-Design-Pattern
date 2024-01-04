package com.rafsanjani.structural.adapter;

public class EmployeeDB implements Employee {

    private String firstName;
    private String lastName;

    public EmployeeDB(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }


    public String getLastName() {
        return lastName;
    }

    @Override
    public String toString() {
        return "EmployeeDB{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}
