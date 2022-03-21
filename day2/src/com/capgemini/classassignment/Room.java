package com.capgemini.classassignment;

public class Room {
	String Laptop;
	String table;
	int noOfLights;
	
	public Room(String Laptop,String table,int noOfLights) {
		this.Laptop=Laptop;
		this.table=table;
		this.noOfLights=noOfLights;
	}
	public void printRoomValue() {
		System.out.println("Laptop Name :"+this.Laptop);
		System.out.println("TableTYpe :"+this.table);
		System.out.println("No oF lights :"+this.noOfLights);
	}
}