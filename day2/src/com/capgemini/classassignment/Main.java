package com.capgemini.classassignment;
import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("---------------Student Class-------------");
	Student emp=new Student();
	//set values to default constructor employee using setter
	//setter 
	String stdName=sc.next(); //taking input from user using Scanner Class
	emp.setName(stdName); 
	double per=sc.nextDouble();
	emp.setPercentage(per);
	int age=sc.nextInt();
	emp.setAge(age);
	//get the values using getter
	//getter
	System.out.println(emp.getName());
	System.out.println(emp.getPercentage());
	System.out.println(emp.getAge());
	System.out.println("---------------Mouse Class-------------");
	//pass values to parameterized constructor
	//get values using printVlaue Method
	int bt=sc.nextInt();
	int dp=sc.nextInt();
	Double sensi=sc.nextDouble();
	Mouse mouse=new Mouse(bt,dp,sensi); //object creation
	mouse.printMouseValue();
	System.out.println("---------------Pen Class-------------");
	Pen pen=new Pen("Blue","cello",0.7); //object creation
	pen.printPenValue();
	System.out.println("---------------Car Class-------------");
	Car car=new Car("XUV700",180.0,15.65); //object creation
	car.printCarValue();
	System.out.println("---------------Mobile Class-------------");
	Mobile mob=new Mobile("Samsung",6,128); //object creation
	mob.printMobileValue();
	System.out.println("---------------Room Class-------------");
	Room rm=new Room("Lenovo","Wooden Table",2); //object creation
	rm.printRoomValue();
}
}
