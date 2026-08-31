package com.bhushan.javabackend;

public class SalaryCalculator {

    public static void main(String[] args) {

        double basicSalary = 30000.00;
        double houseAllowance = 5000.00;
        double transportAllowance = 2000.00;
        double deductions = 1500.00;

        double grossSalary = basicSalary + houseAllowance + transportAllowance;
        double netSalary = grossSalary - deductions;

        System.out.println("===== Salary Details =====");
        System.out.println("Basic Salary: ₹" + basicSalary);
        System.out.println("House Allowance: ₹" + houseAllowance);
        System.out.println("Transport Allowance: ₹" + transportAllowance);
        System.out.println("Gross Salary: ₹" + grossSalary);
        System.out.println("Deductions: ₹" + deductions);
        System.out.println("Net Salary: ₹" + netSalary);
    }
}