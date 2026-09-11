package com.bhushan.javabackend.module01;

public class SalaryCalculator {

    public static void main(String[] args) {

        double basicSalary = 30000.00;
        double houseAllowance = 5000.00;
        double transportAllowance = 2000.00;
        double deductions = 1500.00;

        double grossSalary = basicSalary + houseAllowance + transportAllowance;
        double netSalary = grossSalary - deductions;

        System.out.println("===== Salary Details =====");
        System.out.println("Basic Salary: â‚¹" + basicSalary);
        System.out.println("House Allowance: â‚¹" + houseAllowance);
        System.out.println("Transport Allowance: â‚¹" + transportAllowance);
        System.out.println("Gross Salary: â‚¹" + grossSalary);
        System.out.println("Deductions: â‚¹" + deductions);
        System.out.println("Net Salary: â‚¹" + netSalary);
    }
}
