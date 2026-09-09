package com.bhushan.javabackend;

class Product {

    int productId;
    String productName;
    double price;
    String category;

    void displayProduct() {
        System.out.println("Product ID   : " + productId);
        System.out.println("Product Name : " + productName);
        System.out.println("Price        : ₹" + price);
        System.out.println("Category     : " + category);
        System.out.println();
    }
}

public class ProductCatalogDemo {

    public static void main(String[] args) {

        Product product1 = new Product();

        product1.productId = 101;
        product1.productName = "Wireless Headphones";
        product1.price = 2499;
        product1.category = "Electronics";

        Product product2 = new Product();

        product2.productId = 102;
        product2.productName = "Running Shoes";
        product2.price = 3499;
        product2.category = "Footwear";

        product1.displayProduct();
        product2.displayProduct();
    }
}
