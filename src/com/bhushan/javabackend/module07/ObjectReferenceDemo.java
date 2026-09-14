package com.bhushan.javabackend.module07;

public class ObjectReferenceDemo {

    static class Product {

        private final int productId;
        private final String productName;

        public Product(int productId, String productName) {
            this.productId = productId;
            this.productName = productName;
        }

        public void display() {
            System.out.println(
                    "Product ID: " + productId +
                            ", Product Name: " + productName
            );
        }
    }

    public static void main(String[] args) {

        Product product1 = new Product(101, "Laptop");

        Product product2 = product1;

        System.out.println("product1:");
        product1.display();

        System.out.println("\nproduct2:");
        product2.display();

        System.out.println("\nBoth references point to the same object.");

        product1 = null;

        System.out.println(
                "\nproduct1 is now null, but product2 still references the object."
        );

        product2.display();
    }
}