package com.capgemini.day5;

public class WrapperClass {
	public static void main(String args[]) {

		int i = 34;
		Integer intobj = new Integer(i);

		float f = 32.2f;
		Float floatobj = new Float(f);

		double d = 36.775;
		Double doubleobj = new Double(d);

		char c = 'a';
		Character charobj = c;

		byte b = 1;
		Byte byteobj = new Byte(b);

		System.out.println("Wrapper objects");
		System.out.println("Integer object " + intobj);
		System.out.println("Float object " + floatobj);
		System.out.println("Double object  " + doubleobj);
		System.out.println("Character object " + charobj);
		System.out.println("Byte object " + byteobj);

		byte by = byteobj;
		int in = intobj;
		float fl = floatobj;
		double dob = doubleobj;
		char ch = charobj;

		System.out.println("Unwrapped values");
		System.out.println("byte value " + by);
		System.out.println("int value " + in);
		System.out.println("float value " + fl);
		System.out.println("double value " + dob);
		System.out.println("char value " + ch);
	}
}
