package com.kodilla.good.patterns.Food2DoorChallenge;

public class OrderRetriever {
    OrderService orderService;

    public OrderRetriever(OrderService orderService) {
        this.orderService = orderService;
    }

    public OrderRequest retrieve() {
        Supplier supplier = new ExtraFoodShop(orderService);
        Order order = new Order("Carrot", 12);
        return new OrderRequest(supplier, order);
    }
}
