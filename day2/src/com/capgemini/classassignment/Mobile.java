package com.capgemini.classassignment;

public class Mobile {
	String Brand;
	int RAM;
	int Storage;
	
	public Mobile(String Brand,int RAM,int Storage) {
		this.Brand=Brand;
		this.RAM=RAM;
		this.Storage=Storage;
	}
	public void printMobileValue() {

		System.out.println("Mobile Brand :"+this.Brand);
		System.out.println("Mobile RAM :"+this.RAM);
		System.out.println("Mobile Storage :"+this.Storage);
	}
}
