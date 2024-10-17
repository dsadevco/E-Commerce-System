package com.ecommerce.Orders;

import com.ecommerce.Products.Product;

public class OrderService {
    private static int orderCounter = 111003;

    public Order createOrder(Product product) {
        return new Order(orderCounter++, product);
    }

}
