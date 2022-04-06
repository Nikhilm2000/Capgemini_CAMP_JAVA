package com.example.demo.controller;
import java.util.List;

 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
 
import com.example.demo.beans.Product;
import com.example.demo.service.IProductService;
 
@RestController
public class ProductController {
 
    @Autowired
    IProductService productService;

    @GetMapping(value = "/product")  
    public List<Product> getProduct() {
        return productService.findAll();
    }
}