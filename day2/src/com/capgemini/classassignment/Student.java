package com.capgemini.classassignment;
//Default Constructor
public class Student {
	String name;
	double Percentage;
	int age;

	public Student() {
	}
	public String getName() {
	return this.name;
	}
	public double getPercentage() {
		return this.Percentage;
	}
	public int getAge() {
		return this.age;
	}
	public void setName(String name) {
		this.name=name;
	}
	public void setPercentage(double Percentage) {
		this.Percentage=Percentage;
	}
	public void setAge(int age) {
		this.age=age;
	}
}
