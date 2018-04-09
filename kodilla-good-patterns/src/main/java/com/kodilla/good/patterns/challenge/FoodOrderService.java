package com.kodilla.good.patterns.challenge;

public class FoodOrderService implements OrderService {

    @Override
    public boolean order(User user, Product product) {
        if ("pizza".equals(product.getProductName())){
            return true;
        }
        return false;
    }
}
