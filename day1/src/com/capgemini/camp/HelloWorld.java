package com.capgemini.camp;

enum WeekDays{
	MONDAY,TUESDAY,WEDNESDAY,THURSDAY,FRIDAY,SATURDAY,SUNDAY;
}
enum Months{
	JAN,FEB,MAR,APR,MAY,JUN,JUL,AUG,SEP,OCT,NOV,DEC;
}

public class HelloWorld {
public static void main(String[] args) {
	System.out.println("HelloWorld:-)");
	//int n=2147483648;
	//double d=1.7976931348623157e309;
	//float f=3.4028235e39f;
	//boolean b=true;
	WeekDays Str[]=WeekDays.values();
	System.out.println("----------------Days-------------------");
	for (int i = 0; i < Str.length; i++) {
		System.out.println(Str[i]);
	}
	System.out.println("----------------Months-------------------");
	Months str1[]=Months.values();
	for (int i = 0; i < str1.length; i++) {
		System.out.println(str1[i]);
	}
}
}