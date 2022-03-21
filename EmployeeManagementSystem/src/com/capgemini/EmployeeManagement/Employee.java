package com.capgemini.EmployeeManagement;


public class Employee {
	int id;
	String name;
	double Salary;
	 String doj;
	
	public Employee() {
		
	}

	public Employee(int id, String name, double salary, String doj) {
		super();
		this.id = id;
		this.name = name;
		Salary = salary;
		this.doj = doj;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return Salary;
	}

	public void setSalary(double salary) {
		Salary = salary;
	}

	public String getDoj() {
		return doj;
	}

	public void setDoj(String doj) {
		this.doj = doj;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" +Salary + ", doj=" + doj + "]";
	}
	
	public int compareTo(Employee employee) {
		return getName().compareTo(employee.getName());
	}

	

}