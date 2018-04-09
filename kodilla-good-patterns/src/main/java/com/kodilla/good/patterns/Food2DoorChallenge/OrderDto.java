package com.kodilla.good.patterns.Food2DoorChallenge;

public class OrderDto {
    private String supplier;
    private boolean isOrdered;
    private String product;

    public OrderDto(String supplier, boolean isOrdered, String product) {
        this.supplier = supplier;
        this.isOrdered = isOrdered;
        this.product = product;
    }

    public String getSupplier() {
        return supplier;
    }

    public boolean isOrdered() {
        return isOrdered;
    }

    public String getProduct() {
        return product;
    }
}
