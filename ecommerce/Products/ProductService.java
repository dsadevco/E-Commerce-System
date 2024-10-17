package com.ecommerce.Products;

public class ProductService {
    public Product getProductByName(String productName) {
        return new Product(productName);
    }
}
