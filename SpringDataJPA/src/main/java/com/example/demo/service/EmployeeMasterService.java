package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.EmployeeMasterEntity;
import com.example.demo.repository.EmployeeRepo;

@Service
public class EmployeeMasterService {
	@Autowired
	EmployeeRepo employeerepo;
	
	public EmployeeMasterEntity saveEmployeeMasteEntity(EmployeeMasterEntity employeeMasterEntity) {
		return employeerepo.save(employeeMasterEntity);
		
	}
	public Iterable<EmployeeMasterEntity> findAllContact() {

		return employeerepo.findAll();

		}
}
