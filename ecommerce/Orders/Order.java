package com.ecommerce.Orders;

import com.ecommerce.Products.Product;

public class Order {
    private int orderId;
    private Product product;

    public Order(int orderId, Product product) {
        this.orderId = orderId;
        this.product = product;
    }

    public int getOrderId() {
        return orderId;
    }

    public Product getProduct() {
        return product;
    }
}
