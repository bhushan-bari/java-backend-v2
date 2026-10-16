package com.bhushan.javabackend.module08;

public class StringIdentityDemo {
    public static void main(String[] args) {
        String first = "JAVA";
        String second = "JAVA";
        String third = new String("JAVA");

        System.out.println(first == second);
        System.out.println(first == third);
        System.out.println(first.equals(third));
    }
}