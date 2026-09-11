package com.bhushan.javabackend.module02;

public class StringComparisonDemo {

    public static void main(String[] args) {

        String username1 = "Ramesh";
        String username2 = "Dinesh";
        String username3 = new String("Ramesh");

        System.out.println("username1 == username2: "
                + (username1 == username2));

        System.out.println("username1 == username3: "
                + (username1 == username3));

        System.out.println("username1.equals(username3): "
                + username1.equals(username3));
    }
}
