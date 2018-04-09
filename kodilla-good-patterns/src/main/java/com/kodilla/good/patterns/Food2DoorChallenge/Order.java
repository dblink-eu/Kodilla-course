package com.kodilla.good.patterns.Food2DoorChallenge;

public class Order {
    private String product;
    private int amount;

    public Order(String product, int amount) {
        this.product = product;
        this.amount = amount;
    }

    public String getProduct() {
        return product;
    }

    public int getAmount() {
        return amount;
    }

    @Override
    public String toString() {
        return "Order{" +
                "product='" + product + '\'' +
                ", amount=" + amount +
                '}';
    }
}
