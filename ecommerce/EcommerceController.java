package com.ecommerce;

import com.ecommerce.User.User;
import com.ecommerce.User.UserController;
import com.ecommerce.Products.Product;
import com.ecommerce.Products.ProductController;
import com.ecommerce.Orders.Order;
import com.ecommerce.Orders.OrderController;
import com.ecommerce.Payments.Payment;
import com.ecommerce.Payments.PaymentController;

public class EcommerceController {

    public static void main(String[] args) {
        // Step 1: User Creation
        UserController userController = new UserController();
        User user = userController.getUser("Nobnob");

        // Step 2: Product Selection
        ProductController productController = new ProductController();
        Product product = productController.getProduct("Laptop");

        // Step 3: Product Selection
        OrderController orderController = new OrderController();
        Order order = orderController.createOrder(product);

        // Step 4: Payment Processing
        PaymentController paymentController = new PaymentController();
        Payment payment = paymentController.processPayment(order, "Credit card");

        // Step 5: Displaying the Output
        System.out.println("User Name: " + user.getUserName());
        System.out.println("Product Purchased: " + product.getProductName());
        System.out.println("Order Created: Order ID " + order.getOrderId() + " for product " + product.getProductName());
        System.out.println("Payment Process for order " + order.getOrderId() + " using " + payment.getPaymentMethod());
        System.out.println("Transaction Completed");
        System.out.println("Thank you for shopping with us!");

    }
}
