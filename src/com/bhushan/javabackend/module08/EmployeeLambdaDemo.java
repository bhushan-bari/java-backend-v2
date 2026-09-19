package com.bhushan.javabackend.module08;

class Employee {

    private String name;
    private double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }
}

@FunctionalInterface
interface EmployeeRule {

    boolean check(Employee employee);
}

public class EmployeeLambdaDemo {

    public static void main(String[] args) {

        Employee employee =
                new Employee("Rahul", 60000);

        EmployeeRule highSalary =
                employeeData -> employeeData.getSalary() > 50000;

        System.out.println(
                "Employee: " + employee.getName()
        );

        System.out.println(
                "High Salary: "
                        + highSalary.check(employee)
        );
    }
}