package com.bhushan.javabackend.module05;

class Employee {

    int employeeId;
    String employeeName;
    double salary;

    void displayEmployee() {
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Employee Name: " + employeeName);
        System.out.println("Salary: " + salary);
    }
}

class Manager extends Employee {

    int teamSize;

    void displayManager() {
        displayEmployee();
        System.out.println("Team Size: " + teamSize);
    }
}

public class EmployeeInheritanceDemo {

    public static void main(String[] args) {

        Manager manager = new Manager();

        manager.employeeId = 101;
        manager.employeeName = "Rahul";
        manager.salary = 90000;
        manager.teamSize = 8;

        manager.displayManager();
    }
}