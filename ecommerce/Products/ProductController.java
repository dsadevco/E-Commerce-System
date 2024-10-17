package com.ecommerce.Products;

public class ProductController {
    private ProductService productService = new ProductService();

    public Product getProduct(String productName) {
        return productService.getProductByName(productName);
    }

}