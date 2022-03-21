package com.capgemini.classassignment;

public class Mouse{
	int Buttons;
	int DPI;
	double Sensitivity;
//Parameterized Constructor
	public Mouse(int Buttons,int DPI,double Sensitivity) {
		this.Buttons=Buttons;
		this.DPI=DPI;
		this.Sensitivity=Sensitivity;
		
	}
	public void printMouseValue() {
		System.out.println("No of Buttons :"+this.Buttons);
		System.out.println("Mouse DPI :"+this.DPI);
		System.out.println("Mouse Sensitivity :"+this.Sensitivity);
	
}
}