package com.ecommerce.Payments;

import com.ecommerce.Orders.Order;
public class PaymentService {
    public Payment processPayment(Order order, String paymentMethod){
        return new Payment(order, paymentMethod);
    }
}
