package com.example.demo.entity;

public class Student {
	private String name;
	private int usn;
	
	public Student(String name, int usn) {
		super();
		this.name = name;
		this.usn = usn;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getUsn() {
		return usn;
	}
	public void setUsn(int usn) {
		this.usn = usn;
	}
	public void getStudent() {
		System.out.println(name);
	}
}
