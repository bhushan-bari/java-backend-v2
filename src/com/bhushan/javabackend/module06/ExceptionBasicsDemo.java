package com.bhushan.javabackend.module06;

public class ExceptionBasicsDemo {

    public static void main(String[] args) {

        int firstNumber = 100;
        int secondNumber = 0;

        try {
            int result = firstNumber / secondNumber;
            System.out.println("Result: " + result);

        } catch (ArithmeticException e) {
            System.out.println("Division cannot be performed by zero");

        } finally {
            System.out.println("Finally block executed");
        }

        System.out.println("Program execution completed");
    }
}