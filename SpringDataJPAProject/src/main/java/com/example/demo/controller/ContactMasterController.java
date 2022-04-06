package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.web.bind.annotation.RequestBody;

import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.ContactMasterEntity;

import com.example.demo.service.ContactMasterService;

@RestController

public class ContactMasterController {

	@Autowired

	ContactMasterService contactMasterService;

	@PostMapping("/contact")

	public ContactMasterEntity addNewContact(@RequestBody ContactMasterEntity contactMasterEntity) {

		return contactMasterService.saveContactMasterEntity(contactMasterEntity);

	}

	@GetMapping("/contacts")

	public List<ContactMasterEntity> findAllContact() {

		return (List<ContactMasterEntity>) contactMasterService.findAllContact();

	}

}