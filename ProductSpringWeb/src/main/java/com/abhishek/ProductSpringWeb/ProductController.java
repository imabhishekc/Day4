package com.abhishek.ProductSpringWeb;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductController {
    @Autowired
    ProductService service;
    @GetMapping("/products")
    public List<Product> getAllProducts(){
        return service.getAllProducts();
    }
    @GetMapping("/product/blackbeast")
    public Product getProduct(){
        return service.getProduct("BlackBeast");
    }

    @GetMapping("/products")
    public List<Product> getByWarranty(){
        return service.searchByWarranty(2023);
    }

    @GetMapping("/by%20place")
    public List<Product> getByPlace(){
        return service.getByPlace();
    }
}
