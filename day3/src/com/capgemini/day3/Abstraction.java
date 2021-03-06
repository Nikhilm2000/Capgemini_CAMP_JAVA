package com.capgemini.day3;
// interface can be defined with or without abstraction keyword
//it provides 100% abstraction

abstract interface Employee{
	//not able to give body of methods ,only declaration
	public void print();
}
//abstract class
//it can have both abstract and non abstract method
abstract class Branch{
	 abstract public void printBranch();
	 public void printPrice() {
		 System.out.println("200");
	 }
}
class Dept extends Branch{
	public void printDept() {
		System.out.println("Print Department");
	}
	public void printBranch() {
		System.out.println("Print Branch");
	}
}
//Interface need to implemented by any class,if not we cant use
class Company extends Dept implements Employee{
	public void print() {
		super.printDept();
		System.out.println("Method Interface");
	}
}

public class Abstraction {
	public static void main(String[] args) {
		Company cmp=new Company();
		cmp.print();
		cmp.printDept();
		cmp.printPrice();
	}
}
