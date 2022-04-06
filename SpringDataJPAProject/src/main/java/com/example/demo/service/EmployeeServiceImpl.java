package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.example.demo.entities.Employee;
import com.example.demo.exception.ResourceNotFoundException;
import com.example.demo.repository.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService {
	@Autowired
	EmployeeRepository emprepo;

	@Override
	public Employee saveEmployee(Employee employee) {
		Optional<Employee> emp = emprepo.findById(employee.getId());
		if (emp.isPresent()) {
			throw new ResourceNotFoundException("ResourceNotFoundExceptionth given Id:" + employee.getId());
		} else
			return emprepo.save(employee);
	}

	@Override
	public ResponseEntity<List<Employee>> getAllEmployees() {
		List<Employee> employees = emprepo.findAll();
		if (employees.size() == 0)
			return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
		else
			return ResponseEntity.status(HttpStatus.OK).body(employees);

	}

	@Override
	public Optional<Employee> getEmployeeById(long id) {
		return emprepo.findById(id);
	}

	@Override
	public Employee updateEmployee(Employee updatedEmployee) {
		return emprepo.save(updatedEmployee);
	}

	@Override
	public void deleteEmployee(long id) {
		emprepo.deleteById(id);

	}

}