package com.example.demo.repository;

import java.io.Serializable;


import org.springframework.data.repository.CrudRepository;

import org.springframework.stereotype.Repository;

import com.example.demo.entities.ContactMasterEntity;

@Repository

public interface ContactMasterRepo extends CrudRepository<ContactMasterEntity, Serializable> {

}