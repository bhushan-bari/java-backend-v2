package com.bhushan.javabackend.module08;

import java.util.Comparator;
import java.util.List;

class StreamProduct {

    private String name;
    private double price;

    public StreamProduct(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}

public class StreamProductDemo {

    public static void main(String[] args) {

        List<StreamProduct> products = List.of(
                new StreamProduct("Laptop", 70000),
                new StreamProduct("Mouse", 1000),
                new StreamProduct("Keyboard", 2000),
                new StreamProduct("Monitor", 20000),
                new StreamProduct("Phone", 50000)
        );

        System.out.println("Products above ₹10,000:");

        products.stream()
                .filter(product -> product.getPrice() > 10000)
                .forEach(product ->
                        System.out.println(
                                product.getName() + " - ₹" + product.getPrice()
                        )
                );

        System.out.println("\nProduct names:");

        products.stream()
                .map(StreamProduct::getName)
                .forEach(System.out::println);

        System.out.println("\nProducts sorted by price:");

        products.stream()
                .sorted(Comparator.comparing(StreamProduct::getPrice))
                .forEach(product ->
                        System.out.println(
                                product.getName() + " - ₹" + product.getPrice()
                        )
                );

        long expensiveProductCount = products.stream()
                .filter(product -> product.getPrice() > 10000)
                .count();

        System.out.println(
                "\nProducts above ₹10,000: " + expensiveProductCount
        );
    }
}