package com.capgemini.day6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Employee 
{
	int id;
	String name;
	double salary;
	String doj;


	public Employee(int id, String name, double salary, String doj) {
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.doj = doj;
	}
}

public class MyStreamApi {

	public static void main(String[] args) {

		List<Employee> list = new ArrayList<Employee>();

		list.add(new Employee(101, "Rohith", 2800.0, "2022/10/14"));
		list.add(new Employee(102, "Nikhil", 4900.0, "2021/08/28"));
		list.add(new Employee(103, "Mallik", 5400.0, "2022/01/15"));
		list.add(new Employee(104, "Pavan", 8800.0, "2021/10/14"));
		list.add(new Employee(105, "Arjun", 2400.0, "2022/10/14"));

		List<Integer> ls = new ArrayList<>();
		ls.add(34);
		ls.add(74);
		ls.add(13);
		ls.add(1);
		ls.add(55);
		
		Stream<Integer> st = ls.stream();
		st.forEach(names -> System.out.println(names));
		ls.stream().forEach(names -> System.out.println(names));
		ls.stream().forEach(System.out::println);

		List<Integer> ls2 = ls.stream().filter(a -> (a % 2 == 0)).filter(a -> (a >= 10))
				.sorted(Collections.reverseOrder()).map(a -> a + a / 2).collect(Collectors.toList());
		ls2.forEach(System.out::println); 
		
		list.stream().filter(i -> (i.salary<5000)).forEach(e -> System.out.println(e.name));
		
	}
	
}
