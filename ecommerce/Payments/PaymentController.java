package com.ecommerce.Payments;

import com.ecommerce.Orders.Order;
public class PaymentController {
    private PaymentService payment = new PaymentService();

    public Payment processPayment(Order order, String paymentMethod){
        return payment.processPayment(order, paymentMethod);
    }

}
