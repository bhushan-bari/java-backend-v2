package com.bhushan.javabackend.module08;

class Product {

    private String name;
    private double price;

    public Product(String name, double price) {
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

@FunctionalInterface
interface DiscountRule {

    double calculate(Product product);
}

public class ProductLambdaDemo {

    public static void main(String[] args) {

        Product product =
                new Product("Laptop", 50000);

        DiscountRule tenPercentDiscount =
                productData ->
                        productData.getPrice()
                                - (productData.getPrice() * 0.10);

        System.out.println(
                "Product: " + product.getName()
        );

        System.out.println(
                "Original Price: " + product.getPrice()
        );

        System.out.println(
                "Discounted Price: "
                        + tenPercentDiscount.calculate(product)
        );
    }
}