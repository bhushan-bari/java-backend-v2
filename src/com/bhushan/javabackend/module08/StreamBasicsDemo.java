package com.bhushan.javabackend.module08;

import java.util.List;

public class StreamBasicsDemo {

    public static void main(String[] args) {

        List<Integer> numbers =
                List.of(10, 15, 20, 25, 30, 35, 40);

        System.out.println("Numbers > 20:");

        numbers.stream()
                .filter(n -> n > 20)
                .forEach(System.out::println);

        System.out.println("\nNumbers × 2:");

        numbers.stream()
                .map(n -> n * 2)
                .forEach(System.out::println);

        System.out.println("\nSorted numbers:");

        numbers.stream()
                .sorted()
                .forEach(System.out::println);

        long count = numbers.stream()
                .filter(n -> n > 20)
                .count();

        System.out.println("\nCount > 20: " + count);
    }
}