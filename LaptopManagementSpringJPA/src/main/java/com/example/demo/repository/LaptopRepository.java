package com.example.demo.repository;

import org.springframework.data.repository.CrudRepository;  
import com.example.demo.entities.Laptop;  
//repository that extends CrudRepository  
public interface LaptopRepository extends CrudRepository<Laptop, Integer>  
{  
} 