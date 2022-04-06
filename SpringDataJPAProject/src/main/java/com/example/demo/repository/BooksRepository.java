package com.example.demo.repository;

import org.springframework.data.repository.CrudRepository;  
import com.example.demo.entities.Books;  
//repository that extends CrudRepository  
public interface BooksRepository extends CrudRepository<Books, Integer>  
{  
} 