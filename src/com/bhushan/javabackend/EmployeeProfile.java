package com.bhushan.javabackend;

public class EmployeeProfile {

    public static void main(String[] args) {

        int employeeId = 101;
        String employeeName = "Bhushan";
        double salary = 50000.00;
        String department = "Technology";
        boolean permanentEmployee = true;

        System.out.println("===== Employee Profile =====");
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Employee Name: " + employeeName);
        System.out.println("Salary: ₹" + salary);
        System.out.println("Department: " + department);
        System.out.println("Permanent Employee: " + permanentEmployee);
    }
}