package com.kodilla.good.patterns.Food2DoorChallenge;

public class Supplier {
    public OrderService orderService;

    public Supplier(OrderService orderService) {
        this.orderService = orderService;
    }

    public boolean process(OrderRequest orderRequest) {
        return true;
    }
}
