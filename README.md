E-Commerce System

This project demonstrates a simple E-Commerce system built using Java, showcasing how to structure and integrate packages and classes in a real-world application. The system handles key features such as products, orders, users, and payments using a modular design pattern with various service, controller, and data access layers.
Features

    Products: Add, update, and manage products.
    Orders: Create and track orders for products.
    Users: Register and manage user details.
    Payments: Process payments for orders using various methods (e.g., Credit Card).

Project Structure

bash

com.ecommerce
│
├── EcommerceController.java   # Main method to run the system
│
├── Products
│   ├── Product.java
│   ├── ProductService.java
│   ├── ProductController.java
│   └── ProductDAO.java
│
├── Orders
│   ├── Order.java
│   ├── OrderService.java
│   ├── OrderController.java
│   └── OrderDAO.java
│
├── User
│   ├── User.java
│   ├── UserService.java
│   ├── UserController.java
│   └── UserDAO.java
│
└── Payments
    ├── Payment.java
    ├── PaymentService.java
    ├── PaymentController.java
    └── PaymentDAO.java

Expected Output

sql

User Name: Nobnob  
Product Purchased: Laptop  
Order Created: Order ID 111003 for product Laptop  
Payment Process for order 111003 using Credit Card  
Transaction Completed  
Thank you for shopping with us!  

Usage

    Clone the repository:

    bash

git clone https://github.com/dsadevco/E-Commerce-System.git

Navigate to the project directory:

bash

    cd ecommerce

    Open the project in your preferred IDE (e.g., IntelliJ IDEA, Eclipse).

    Run the EcommerceController.java file to start the system.

    The system will simulate the process of purchasing a product, creating an order, and processing the payment.

Video Demo
Watch the video demonstration on YouTube: https://www.youtube.com/watch?v=KpiaWvCOUD4

GitHub Repository
Find the project code on GitHub: E-Commerce System Repository
