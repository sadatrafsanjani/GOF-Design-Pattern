package com.rafsanjani.structural.adapter;

import java.util.ArrayList;
import java.util.List;

public class Client {

    public static List<Employee> getEmployeeList(){

        List<Employee> employees = new ArrayList<>();

        Employee employee = new EmployeeDB("Jonah", "Hex");
        employees.add(employee);

        Executive executive = new Executive("John Wick");
        Employee executiveEmployee = new ExecutiveAdapter(executive);

        employees.add(executiveEmployee);

        return employees;
    }
}
