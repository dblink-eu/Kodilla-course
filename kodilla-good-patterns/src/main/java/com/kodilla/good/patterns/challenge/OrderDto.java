package com.kodilla.good.patterns.challenge;

public class OrderDto {
    private String username;
    private boolean isOrdered;
    private String productName;

    public OrderDto(String username, String productName, boolean isOrdered) {
        this.username = username;
        this.isOrdered = isOrdered;
        this.productName = productName;
    }

    public String getUsername() {
        return username;
    }

    public boolean isOrdered() {
        return isOrdered;
    }

    public String getProductName() {
        return productName;
    }
}
