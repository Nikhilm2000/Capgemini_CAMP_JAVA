package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.http.ResponseEntity;

import com.example.demo.entities.Employee;

public interface EmployeeService {
	Employee saveEmployee(Employee employee);

	ResponseEntity<List<Employee>> getAllEmployees();

	Optional<Employee> getEmployeeById(long id);

	Employee updateEmployee(Employee updatedEmployee);

	void deleteEmployee(long id);
}