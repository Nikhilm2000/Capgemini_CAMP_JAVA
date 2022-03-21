package com.capgemini.classassignment;
class A{
	public A(){
		System.out.println("parent Constructor");
	}
	public void printA(){
		System.out.println("This is Parent Class A");
	}
	
}
class B extends A{
	public B() {
	super();
	System.out.println("child Constructor");
	
	}
	public void printB() {
		super.printA();
		System.out.println("This is Class B-child class");
	}
}
public class SingleInheritence {
public static void main(String[] args) {
	B obj=new B();
	obj.printB();
}
}
