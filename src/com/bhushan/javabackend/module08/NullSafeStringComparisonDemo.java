package com.bhushan.javabackend.module08;

public class NullSafeStringComparisonDemo {
    public static void main(String[] args) {
        String status = null;

        System.out.println("SUCCESS".equals(status));
        System.out.println(status == null);
    }
}