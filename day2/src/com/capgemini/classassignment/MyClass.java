package com.capgemini.classassignment;
class Employee{
	//Its called POJO class
	//Plain old java object--POJO
	//Model Class --its a class which hold the value of object
	String name;
	double Salary;
	int age;

public Employee() {
}
public String getName() {
	return this.name;
}
public double getSalary() {
	return this.Salary;
}
public int getAge() {
	return this.age;
}
public void setName(String name) {
	this.name=name;
}
public void setSalary(double Salary) {
	this.Salary=Salary;
}
public void setAge(int age) {
	this.age=age;
}
public Employee(String name,double Salary,int age) {
	this.name=name;
	this.Salary=Salary;
	this.age=age;
}
public void printValue() {
	//print method
	//method name start with lower case
	System.out.println("Name "+this.name);
	System.out.println("Salary "+this.Salary);
	System.out.println("Age "+this.age);
}
}
public class MyClass {

	public static void main(String[] args) {
		//create object
		//classname name=new classname(parameters)
		
		Employee emp=new Employee();
		//set values to default constructor employee using setter
		emp.setName("Nikhil");
		emp.setSalary(10000.00);
		emp.setAge(21);
		//get the values using getter
		System.out.println(emp.getName());
		System.out.println(emp.getSalary());
		System.out.println(emp.getAge());
		//pass values to parameterized constructor
		Employee emp1=new Employee("Pavan",9999.99,22);
		//get values using printVlaue Method
		emp1.printValue();
	}
	
	
}
