package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.example.demo.entities.ContactMasterEntity;

import com.example.demo.repository.ContactMasterRepo;

@Service

public class ContactMasterService {

	@Autowired

	ContactMasterRepo contactMasterRepo;

	public ContactMasterEntity saveContactMasterEntity(ContactMasterEntity contactMasterEntity) {

		return contactMasterRepo.save(contactMasterEntity);

	}

	public Iterable<ContactMasterEntity> findAllContact() {

		return contactMasterRepo.findAll();

	}

}