package com.capgemini.classassignment;

public class Car{
	String model;
	double speed;
	double mileage;
	
	public Car(String model,double speed,double mileage) {
		this.model=model;
		this.speed=speed;
		this.mileage=mileage;
	}
	public void printCarValue() {
		System.out.println("Car Model :"+this.model);
		System.out.println("Car Average Speed :"+this.speed);
		System.out.println("Car Average Mileage :"+this.mileage);
	}
}
