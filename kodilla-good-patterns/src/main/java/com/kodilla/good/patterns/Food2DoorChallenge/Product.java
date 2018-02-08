package com.kodilla.good.patterns.Food2DoorChallenge;

public class Product {
    private String productName;
    private double amount;

    public Product(String productName, double price) {
        this.productName = productName;
        this.amount = price;
    }

    public String getProductName() {
        return productName;
    }

    public double getAmount() {
        return amount;
    }


}
