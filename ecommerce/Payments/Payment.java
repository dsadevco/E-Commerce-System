package com.ecommerce.Payments;

import com.ecommerce.Orders.Order;
public class Payment {
    private Order order;
    private String paymentMethod;

    public Payment(Order order, String paymentMethod) {
        this.order = order;
        this.paymentMethod = paymentMethod;
    }
    public Order getOrder() {
        return order;
    }
    public String getPaymentMethod() {
        return paymentMethod;
    }
}
