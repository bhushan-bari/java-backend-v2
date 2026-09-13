package com.bhushan.javabackend.module06;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class CheckedUncheckedDemo {

    public static void main(String[] args) {

        // Unchecked exception
        int totalItems = 100;
        int customers = 0;

        try {

            int itemsPerCustomer = totalItems / customers;

            System.out.println("Items per customer: "
                    + itemsPerCustomer);

        } catch (ArithmeticException e) {

            System.out.println("Cannot divide by zero");
        }

        // Checked exception
        try {

            FileReader reader = new FileReader("products.txt");

            System.out.println("Product file opened");

        } catch (FileNotFoundException e) {

            System.out.println("Product file not found");
        }

        System.out.println("Program completed");
    }
}