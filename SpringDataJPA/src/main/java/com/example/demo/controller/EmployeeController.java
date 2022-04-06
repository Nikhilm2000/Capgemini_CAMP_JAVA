package com.example.demo.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.EmployeeMasterEntity;
import com.example.demo.service.EmployeeMasterService;

@RestController
public class EmployeeController {
	@Autowired
	EmployeeMasterService employeeMasterService;
	@PostMapping("/employee")
	public EmployeeMasterEntity addNewEmployee(@RequestBody EmployeeMasterEntity employeeMasterEntity) {
		return employeeMasterService.saveEmployeeMasteEntity(employeeMasterEntity);
		
	}
	@GetMapping("/employees")
	public List<EmployeeMasterEntity> findAllContact(){

	return (List<EmployeeMasterEntity>) employeeMasterService.findAllContact();

	}
	
}
