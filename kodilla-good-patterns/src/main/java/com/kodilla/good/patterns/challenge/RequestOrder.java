package com.kodilla.good.patterns.challenge;

public class RequestOrder {
    private User username;
    private Product product;

    public RequestOrder(User username, Product product) {
        this.username = username;
        this.product = product;
    }

    public User getUser() {
        return username;
    }

    public Product getProduct() {
        return product;
    }

}