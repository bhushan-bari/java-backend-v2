package com.bhushan.javabackend.module08;

class MethodReferenceProduct {

    private String name;
    private double price;

    MethodReferenceProduct(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public void display() {
        System.out.println("Name: " + getName() + ", Price: " + getPrice());
    }
}

@FunctionalInterface
interface ProductPrinter {
    void print(MethodReferenceProduct product);
}

public class ProductMethodReferenceChallenge {

    public static void main(String[] args) {

        MethodReferenceProduct product =
                new MethodReferenceProduct("Laptop", 55000);

        ProductPrinter printer =
                MethodReferenceProduct::display;

        printer.print(product);
    }
}