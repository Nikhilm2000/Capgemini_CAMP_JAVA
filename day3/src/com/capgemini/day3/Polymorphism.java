package com.capgemini.day3;

class Person {
	public void Print() {
		System.out.println("I am person");
	}
}
                                                                    
class College extends Person {
	@Override
	public void Print() {
		System.out.println("I am Student");
	}
}

class Office extends Person {
	public void Print() {
		System.out.println("I am Employee");
	}
}

class Home extends Person {
	@Override
	public void Print() {
		System.out.println("I am Son");
	}
}

class Mul extends Person {
	int a;
	int b;
	int c;
	int mul;

	public Mul(int a, int b) {
		mul = a * b;
	}

	public Mul(int a, int b, int c) {
		mul = a * b * c;
	}

	public void Print() {
		System.out.println(mul);
	}
}

public class Polymorphism {
	public static void main(String[] args) {
		Person Nikhil = new Office(); // Office
		Nikhil.Print();
		Nikhil = new College(); // College
		Nikhil.Print();
		Nikhil = new Home(); // Home
		Nikhil.Print();
		Nikhil = new Mul(8, 8); // By passing Different Parameters
		Nikhil.Print();
		Nikhil = new Mul(8, 8, 8);
		Nikhil.Print();
	}
}
