package com.capgemini.day6;

interface Helloworld {
	void hello();
}

interface Execute {
	public void add(int a, int b);
}

interface Upper {
	public String toUp(String str);
}

interface Charat {
	public char charat(String str1);
}

interface Even {
	public int evn(int en);
}

interface Num {
	public int checknum(int no);
}

interface CubeRoot {
	public void cube(int cb);
}

interface name {
	public void name1(String name);
}

interface Loop {
	public void loops(int numm);
}

public class MyLambda {

	public static void main(String[] args) {
		//hello world
		Helloworld hw = () -> System.out.println("Hello World");
		hw.hello();
		
		//add 2 integers
		Execute e = (a, b) -> System.out.println(a + b);
		e.add(50, 20);
		
		// string to upper case
		Upper up = str -> str.toUpperCase();
		String str = up.toUp("nikhil");
		System.out.println(str);

		//return chart at first position
		Charat ch = str1 -> str1.charAt(0);
		char str1 = ch.charat("Nikhil");
		System.out.println(str1);

		// check even or odd
		Even ev = en -> {
			if (en % 2 == 0)
				System.out.println(en + " is Even");
			else
				System.out.println(en + " is Odd");
			return en;
		};
		ev.evn(3);
		ev.evn(4);

		//check positive or negative
		Num n = no -> {
			if (no > 0)
				System.out.println(no + " is Positive");
			else
				System.out.println(no + " is Negative");
			return no;
		};
		n.checknum(-3);
		n.checknum(4);

		// cube of number
		CubeRoot cr = cb -> System.out.println(Math.pow(cb, 3));
		cr.cube(5);

		//loop
		Loop lp = num -> {
			while (num <= 100) {
				System.out.println(num);
				num += 5;
			}
		};
		lp.loops(0);

	}
}
