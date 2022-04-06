package com.capgemini.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

class Student {
	int usn;
	String name;
	String branch;

	public Student(int usn, String name, String branch) {
		super();
		this.usn = usn;
		this.name = name;
		this.branch = branch;
	}

	public int getUsn() {
		return usn;
	}

	public void setUsn(int usn) {
		this.usn = usn;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

}

public class StudentFilterStream {
	public static void main(String[] args) {
		List<Student> studentList = Arrays.asList(new Student(101, "Nikhil", "CS"), new Student(102, "Rahul", "IT"),
				new Student(103, "Pavan", "CS"), new Student(104, "Sachin", "ME"), new Student(105, "Varun", "EC"));
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Searched Student Name");
		String name = sc.next();
		String branch = studentList.stream().filter(s -> s.getName().equalsIgnoreCase(name)).map(Student::getBranch)
				.findAny().orElse(null);
		System.out.println(branch);
	}

}
