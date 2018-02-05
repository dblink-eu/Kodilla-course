package com.kodilla.good.patterns.challenge;

public class Application {
    public static void main(String[] args) {
        RequestOrder request1 =  prepareRequest();
        OrderProcessor processor = new OrderProcessor(new FoodOrderService());
        OrderDto orderDto = processor.process(request1);
        System.out.println(orderDto.getProductName() + " " + orderDto.isOrdered());
    }

    private static RequestOrder prepareRequest() {
        User user1 = new User("gzasadzinski");
        Product product = new Product("pizza", 35.00);
        return  new RequestOrder(user1, product);
    }
}
