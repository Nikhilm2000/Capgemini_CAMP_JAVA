package com.capgemini.day3;
// Abstract class
abstract class Shape {
	String color;
	
	//abstract methods
	public abstract double area();
	public abstract String toString();

	public Shape(String color)
	{
		System.out.println("Shape constructor called");
		this.color = color;
	}

	public String getColor() { 
		return this.color; 
		}
}
class Circle extends Shape {
	double radius;

	public Circle(String color, double radius)
	{
		super(color);
		System.out.println("Circle constructor called");
		this.radius = radius;
	}

	@Override 
	public double area(){
		return Math.PI * Math.pow(radius, 2);
	}

	@Override 
	public String toString(){
		return "Circle color :" + super.getColor()+ ", area : " + area();
	}
}
class Rectangle extends Shape {
	double len;
	double wid;

	public Rectangle(String color, double len,double wid)
	{
		super(color);
		System.out.println("Rectangle constructor called");
		this.len = len;
		this.wid = wid;
	}

	@Override 
	public double area() {
		return len * wid; 
		}

	@Override
	public String toString(){
		return "Rectangle color : " + super.getColor()
			+ " ,area  : " + area();
	}
}
public class AbstractionExp {
	public static void main(String[] args)
	{
		Shape s1 = new Circle("Red", 4.2);
		Shape s2 = new Rectangle("Yellow", 3, 5);

		System.out.println(s1.toString());
		System.out.println(s2.toString());
	}
}

