package com.capgemini.day5;

import java.util.Comparator;

public class Employee
//public class Employee implements Comparable<Employee> 
{
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
		return "Employee [id=" + id + ", name=" + name + ", salary=" + Salary + ", doj=" + doj + "]";
	}

	/*
	 * public int compareTo(Employee employee) { return
	 * getName().compareTo(employee.getName()); }
	 * 
	 * 
	 * public int compareTo(Employee employee) { 
	 * 	return getName().compareTo(employee.getName()); 
	 * } 
	 * if (getId() > employee.getId()) {
	 * 	return 1; 
	 * } else if (getId() < employee.getId()) { return -1; } else return
	 * 0;
	 */

}

class SortByName implements Comparator<Employee> {

	public int compare(Employee o1, Employee o2) {
		return o1.getName().compareTo(o2.getName());
	}
}

class SortById implements Comparator<Employee> {
	
	public int compare(Employee o1, Employee o2) {
		if (o1.getId() > o2.getId()) {
			return 1;
		} else if (o1.getId() < o2.getId()) {
			return -1;
		} else
			return 0;
	}
}