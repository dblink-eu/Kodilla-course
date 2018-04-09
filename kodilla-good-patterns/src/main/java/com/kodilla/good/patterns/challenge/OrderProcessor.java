package com.kodilla.good.patterns.challenge;

public class OrderProcessor {
    private OrderService orderService;

    public OrderProcessor(OrderService orderService) {
        this.orderService = orderService;
    }

    public OrderDto process (RequestOrder request){
      boolean result = orderService.order(request.getUser(), request.getProduct());
      return new OrderDto(request.getUser().getUsername(),request.getProduct().getProductName(), result);
    }

}