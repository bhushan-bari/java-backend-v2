package com.bhushan.javabackend.module08;

public class StringInternDemo {
    public static void main(String[] args) {
        String original = new String("BANK");
        String literal = "BANK";
        String pooled = original.intern();

        System.out.println(original == literal);
        System.out.println(pooled == literal);
        System.out.println(original.equals(literal));
    }
}