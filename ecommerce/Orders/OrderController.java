package com.ecommerce.Orders;

import com.ecommerce.Products.Product;
public class OrderController {
    private OrderService orderService = new OrderService();

    public Order createOrder(Product product) {
        return orderService.createOrder(product);
    }
}
