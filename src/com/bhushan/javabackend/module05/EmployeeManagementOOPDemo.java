package com.bhushan.javabackend.module05;

abstract class StaffMember {

    private int id;
    private String name;

    public StaffMember(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void displayStaff() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
    }

    public abstract double calculateSalary();
}

class FullTimeEmployee extends StaffMember {

    private double monthlySalary;

    public FullTimeEmployee(
            int id,
            String name,
            double monthlySalary) {

        super(id, name);
        this.monthlySalary = monthlySalary;
    }

    public double getMonthlySalary() {
        return monthlySalary;
    }

    @Override
    public double calculateSalary() {
        return monthlySalary;
    }
}

class PartTimeEmployee extends StaffMember {

    private int hoursWorked;
    private double hourlyRate;

    public PartTimeEmployee(
            int id,
            String name,
            int hoursWorked,
            double hourlyRate) {

        super(id, name);
        this.hoursWorked = hoursWorked;
        this.hourlyRate = hourlyRate;
    }

    public int getHoursWorked() {
        return hoursWorked;
    }

    public double getHourlyRate() {
        return hourlyRate;
    }

    @Override
    public double calculateSalary() {
        return hoursWorked * hourlyRate;
    }
}

interface SalaryPayment {

    void paySalary(double salary);
}

class BankSalaryPayment implements SalaryPayment {

    @Override
    public void paySalary(double salary) {
        System.out.println(
                "Salary paid through bank: ₹" + salary
        );
    }
}

class CashSalaryPayment implements SalaryPayment {

    @Override
    public void paySalary(double salary) {
        System.out.println(
                "Salary paid in cash: ₹" + salary
        );
    }
}

public class EmployeeManagementOOPDemo {

    public static void main(String[] args) {

        StaffMember employee1 =
                new FullTimeEmployee(
                        101,
                        "Rahul",
                        60000
                );

        StaffMember employee2 =
                new PartTimeEmployee(
                        102,
                        "Amit",
                        80,
                        500
                );

        System.out.println("FULL-TIME EMPLOYEE");

        employee1.displayStaff();

        double salary1 =
                employee1.calculateSalary();

        System.out.println("Salary: ₹" + salary1);

        System.out.println();

        System.out.println("PART-TIME EMPLOYEE");

        employee2.displayStaff();

        double salary2 =
                employee2.calculateSalary();

        System.out.println("Salary: ₹" + salary2);

        System.out.println();

        SalaryPayment bankPayment =
                new BankSalaryPayment();

        bankPayment.paySalary(salary1);

        SalaryPayment cashPayment =
                new CashSalaryPayment();

        cashPayment.paySalary(salary2);
    }
}