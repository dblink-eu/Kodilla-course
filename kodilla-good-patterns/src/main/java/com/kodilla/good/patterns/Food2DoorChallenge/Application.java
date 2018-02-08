package com.kodilla.good.patterns.Food2DoorChallenge;

public class Application {
    public static void main(String [] args) {
        OrderService orderService = new OrderService();
        OrderRetriever orderRetriever = new OrderRetriever(orderService);
        OrderRequest orderRequest = orderRetriever.retrieve();
        Supplier supplier =orderRequest.getSupplier();
        supplier.process(orderRequest);
    }
}
