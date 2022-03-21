package com.capgemini.classassignment;

public class Pen {
	String color;
	String name;
	double pointSize;
	
	public Pen(String color,String name,double pointSize) {
		this.color=color;
		this.name=name;
		this.pointSize=pointSize;
	}
	public void printPenValue() {

		System.out.println("Pen Ink Color :"+this.color);
		System.out.println("Pen Brand :"+this.name);
		System.out.println("Pen lead size :"+this.pointSize);
	}
}
