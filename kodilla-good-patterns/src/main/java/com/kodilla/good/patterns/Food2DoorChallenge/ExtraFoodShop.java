package com.kodilla.good.patterns.Food2DoorChallenge;

public class ExtraFoodShop extends Supplier {
    public ExtraFoodShop(OrderService orderService) {
        super(orderService);
    }

    @Override
    public boolean process(OrderRequest orderRequest) {
        boolean isOrdered = orderService.order(orderRequest.getSupplier(), orderRequest.getOrder());
        if (!isOrdered) {
            System.out.println("Ordered are not realised");
        }
        int minAmount = 10;
        if (orderRequest.getOrder().getAmount() > minAmount) {
            System.out.println("Ordered is confimed");
            return true;
        } else {
            System.out.println("Amount is lower than min amount of order");
            return false;
        }
    }
}
