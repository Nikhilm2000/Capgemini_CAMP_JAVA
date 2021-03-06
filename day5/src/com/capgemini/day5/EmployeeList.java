package com.capgemini.day5;

import java.text.DateFormat;

import java.text.SimpleDateFormat;
import java.util.Collections;
import java.util.Date;
import java.util.LinkedList;
import java.util.Scanner;


public class EmployeeList {

	public static void main(String[] args) {

		LinkedList<Employee> list = new LinkedList<Employee>();

		list.add(new Employee(101, "Rohith", 2800.0, "2022/10/14"));
		list.add(new Employee(102, "Nikhil", 4900.0, "2021/08/28"));
		list.add(new Employee(103, "Mallik", 5400.0, "2022/01/15"));
		list.add(new Employee(104, "Pavan", 8800.0, "2021/10/14"));
		list.add(new Employee(105, "Arjun", 2400.0, "2022/10/14"));
		
		// Collections.sort(list);
		Collections.sort(list, new SortByName());
		//Collections.sort(list, new SortById());
		for (Employee e : list) {
			System.out.println(e);
		}
	}
}
