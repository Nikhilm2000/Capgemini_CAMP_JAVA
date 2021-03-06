package com.capgemini.day5;

class EmployeeGeneric<A, B, C> {
	private A id;
	private B name;
	private C salary;

	public EmployeeGeneric(A id, B name, C salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	public A getId() {
		return id;
	}

	public void setId(A id) {
		this.id = id;
	}

	public B getName() {
		return name;
	}

	public void setName(B name) {
		this.name = name;
	}

	public C getSalary() {
		return salary;
	}

	public void setSalary(C salary) {
		this.salary = salary;
	}

	public String printVal() {
		return "[name :"+name+" id :"+id+" salary :"+salary+"]";
	}

}

public class GenericClass {
	public static void main(String[] args) {
		EmployeeGeneric emp = new EmployeeGeneric<Integer,String, Integer>(101,"nikhil",25000);
		System.out.println(emp.printVal());
		emp.setName("rahul");
		emp.setId(102);
		emp.setSalary(35000);
		System.out.println("[name :"+emp.getName()+" id :"+emp.getId()+" salary :"+emp.getSalary()+"]");
	}
}
