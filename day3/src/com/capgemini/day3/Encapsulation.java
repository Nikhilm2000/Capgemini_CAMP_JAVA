package com.capgemini.day3;

class Employee1 {
	// variables are private
	// only class methods will have access to these private variable
	private String name;
	private int ssn;
	private String dept;

	public String getName() {
		return this.name;
	}

	public int getSSN() {
		return this.ssn;
	}

	public String getDept() {
		return this.dept;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setSSN(int ssn) {
		this.ssn = ssn;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public String toString() {
		return "Name=" + name + " SSN=" + ssn + " Department=" + dept;
	}
}

class Department {
	private String dept;
	private int deptid;

	public String getDept() {
		return this.dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public int getDeptId() {
		return this.deptid;
	}

	public void setDeptId(int deptid) {
		this.deptid = deptid;
	}

	public String toString() {
		return "Department Name=" + dept + " Department ID=" + deptid;
	}
}

class Student22 {
	private String name;
	private int rollno;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRollno() {
		return rollno;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}

	public String toString() {
		return "Student Name=" + name + " Roll No=" + rollno;
	}

}

public class Encapsulation {
	public static void main(String[] args) {
		Employee1 emp = new Employee1();
		emp.setName("Nikhil");
		emp.setDept("Cloud GCP");
		emp.setSSN(2022066);
		// emp.name="Nikhil"; //if variable is public we can access here and set values
		// emp.dept="Cloud";
		System.out.println(emp.toString());
		Department dept = new Department();
		dept.setDept("Cloud GCP");
		dept.setDeptId(66);
		System.out.println(dept.toString());
		Student22 std = new Student22();
		std.setName("Rahul");
		std.setRollno(498);
		System.out.println(std.toString());
	}
}
