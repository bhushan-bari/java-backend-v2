package com.bhushan.javabackend.module09;

@FunctionalInterface
interface Calculator{
    int calculate(int a,int b);
}
public class LambdaCalculatorDemo {
    public static void main(String[] args) {
         Calculator addition=(a, b)->a+b;

        Calculator Substraction=(a, b)->a-b;

        Calculator multiplication=(a, b)->a*b;

        System.out.println("Addition ;"+addition.calculate(20,10));

        System.out.println("Substraction ;"+Substraction.calculate(20,10));

        System.out.println("Multiplication ;"+multiplication.calculate(20,10));

    }
}
