package com.capgemini.day3;
abstract interface Features{
	public void Price();
	public void Brand();
}
//mobile
abstract class Mobile1 implements Features{
	@Override
	public void Price() {
		System.out.println("25000");
		
	}
	@Override
	public void Brand() {
		System.out.println("Samsung S20");
	}
	abstract public void Storage();
	
}
class MobileStorage extends Mobile1{
	@Override
	public void Storage() {
		System.out.println("RAM:8GB,Storage:256GB");
	}
}

//laptop
abstract class Laptop  implements Features{
	public void Price() {
		System.out.println("150000");
		
	}
	public void Brand() {
		System.out.println("Apple MacBook Pro");	
	}
		abstract public void Storage();
}
class LaptopStorage extends Laptop{
		@Override
		public void Storage() {
			System.out.println("Processor:M1 Pro,RAM:16GB,Storage:1TB");
		}
}

//TV
abstract class TV  implements Features{
	public void Price() {
		System.out.println("55000");
		
	}
	public void Brand() {
		System.out.println("Sony Bravia");
	}
	abstract public void Size();
	
	}
	class TVSize extends TV{
		@Override
		public void Size() {
			System.out.println("DisplaySize: 75-inch");
		}
}
	
	//TV
abstract class Car  implements Features{
	public void Price() {
		System.out.println("1055000");
		
	}
	public void Brand() {
		System.out.println("RangeRover Velar");
	}
	abstract public void TopSpeed();
	abstract public void AvgMileage();
	
	}
	class CarSpecs extends Car{
		@Override
		public void TopSpeed() {
			System.out.println("TopSpeed: 225KM/Hr");
		}
		@Override
		public void AvgMileage() {
			System.out.println("Average Mileage: 12.5 KM/PL");
		}
}
//Student
abstract class Student1{
		public void sendUSN() {
			System.out.println("1by19cs407");
			
		}

		public void Name() {
			System.out.println("Nikhil");
		}
		abstract public void StdMarks();
}
class Marks extends Student1{
		@Override
		public void StdMarks() {
			System.out.println("Marks:92,45,65,77,88");
		}
}
public class MobileAbstraction {
	public static void main(String[] args) {
		System.out.println("----------Student----------");
		Marks BBK=new Marks();
		BBK.Name();
		BBK.sendUSN();
		BBK.StdMarks();
		System.out.println("----------Laptop----------");
		LaptopStorage lt=new LaptopStorage();
		lt.Brand();
		lt.Price();
		lt.Storage();
		System.out.println("----------Mobile----------");
		MobileStorage mob=new MobileStorage();
		mob.Brand();
		mob.Price();
		mob.Storage();
		System.out.println("----------TV----------");
		TVSize tv=new TVSize();
		tv.Brand();
		tv.Price();
		tv.Size();
		System.out.println("----------Car----------");
		CarSpecs car=new CarSpecs();
		car.Brand();
		car.Price();
		car.AvgMileage();
		car.TopSpeed();
	}

}
