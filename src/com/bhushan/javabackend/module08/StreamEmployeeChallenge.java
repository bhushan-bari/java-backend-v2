package com.bhushan.javabackend.module08;

import java.util.Comparator;
import java.util.List;

class StreamEmployee {

    private String name;
    private String department;
    private double salary;

    public StreamEmployee(
            String name,
            String department,
            double salary) {

        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    public double getSalary() {
        return salary;
    }
}

public class StreamEmployeeChallenge {

    public static void main(String[] args) {

        List<StreamEmployee> employees = List.of(
                new StreamEmployee("Rahul", "IT", 80000),
                new StreamEmployee("Amit", "HR", 50000),
                new StreamEmployee("Priya", "IT", 90000),
                new StreamEmployee("Sneha", "Finance", 70000),
                new StreamEmployee("Rohan", "IT", 60000)
        );

        System.out.println("IT Employees:");

        employees.stream()
                .filter(employee ->
                        employee.getDepartment().equals("IT"))
                .forEach(employee ->
                        System.out.println(employee.getName()));

        System.out.println("\nSalary > ₹70,000:");

        employees.stream()
                .filter(employee ->
                        employee.getSalary() > 70000)
                .forEach(employee ->
                        System.out.println(employee.getName()));

        System.out.println("\nEmployee Names:");

        employees.stream()
                .map(StreamEmployee::getName)
                .forEach(System.out::println);

        System.out.println("\nEmployees sorted by salary:");

        employees.stream()
                .sorted(Comparator.comparing(StreamEmployee::getSalary))
                .forEach(employee ->
                        System.out.println(
                                employee.getName()
                                        + " - ₹"
                                        + employee.getSalary()));

        long itEmployeeCount = employees.stream()
                .filter(employee ->
                        employee.getDepartment().equals("IT"))
                .count();

        System.out.println(
                "\nIT Employee Count: " + itEmployeeCount);
    }
}