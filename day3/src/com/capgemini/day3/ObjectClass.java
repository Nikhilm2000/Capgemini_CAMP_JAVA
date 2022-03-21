package com.capgemini.day3;
class Student{
	String name;
	public Student(String name) {
		this.name=name;
	}
	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name=name;
	}
	//default constructor will be created by compiler
@Override
	public String toString() {
		return "Hello";
	}
}
public class ObjectClass {
	public static void main(String[] args) {
		Student std=new Student("Nikhil");
		System.out.println(std.hashCode());
		System.out.println(std.getClass());
		System.out.println(std.equals(std));
		System.out.println(std.toString());
		
		
		
	}
}
