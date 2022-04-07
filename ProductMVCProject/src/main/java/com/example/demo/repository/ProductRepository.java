package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;



import com.example.demo.entities.Product;
public interface ProductRepository extends JpaRepository<Product, Long> {
}