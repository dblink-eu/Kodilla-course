package com.kodilla.good.patterns.Food2DoorChallenge;

public class OrderProcessor {
    private OrderService orderService;

    public OrderProcessor(OrderService orderService) {
        this.orderService = orderService;
    }

}
