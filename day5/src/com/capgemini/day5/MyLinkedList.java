package com.capgemini.day5;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Stack;
import java.util.Vector;

class Employee1{
	int id;
	String name;
	Double Salary;
	String Department;

	public Employee1() {

	}

	public Employee1(int id, String name, Double salary, String department) {
		super();
		this.id = id;
		this.name = name;
		Salary = salary;
		Department = department;
	}

	public String toString() {
		return "[----Name----:" + name + "" + "----id----:" + id + "" + "----Salary----:" + Salary + ""
				+ "----Department----:" + Department + "]";
	}
}

public class MyLinkedList {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		LinkedList<Employee1> list = new LinkedList<Employee1>();
		list.addFirst(new Employee1(101, "Nikhil", 39000.0, "Cloud"));
		list.add(new Employee1(102, "Pavan", 28000.0, "FullStack"));
		list.add(new Employee1(103, "Mallik", 54000.0, "Developer"));
		list.add(new Employee1(104, "Zulfi", 2800.0, "Testing"));
		list.add(new Employee1(105, "Arjun", 2400.0, "Quality"));
		list.add(new Employee1(106, "Sharma", 1900.0, "Sales"));
		list.add(new Employee1(107, "Rahul", 3400.0, "Technical"));
		list.add(new Employee1(108, "Bharath", 2200.0, "Support"));
		
		Iterator<Employee1> it=list.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		

		// list.get get value with index
		System.out.println(list.get(2));

		// list.poll  return the head
		System.out.println(list.poll());

		// remove
		list.remove(0);
		list.removeFirst();
		list.removeLast();

		// list.size
		System.out.println(list.size());

		// list sublist
		System.out.println(list.subList(0, 2));

		// display
		for (Employee1 e : list)
			System.out.println(e);

		Stack<Integer> stack = new Stack<Integer>();
		stack.add(24);
		stack.add(4);
		stack.add(68);
		stack.add(22);
		stack.add(9);

		System.out.println(stack);
		System.out.println(stack.capacity());
		Stack<Integer> stack2 = new Stack<Integer>();
		stack2.add(24);
		stack2.add(44);
		stack2.add(168);
		stack2.add(2);
		stack2.add(49);
		stack.addAll(stack2);
		System.out.println(stack);

		System.out.println(stack.containsAll(stack2));
		System.out.println(stack.contains(24));

		stack.remove(4);
		stack.removeElementAt(2);
		System.out.println(stack);

		stack.removeAll(stack2);
		System.out.println(stack);

		stack.insertElementAt(100, 0);
		System.out.println(stack);

		System.out.println(stack.firstElement());
		System.out.println(stack.lastElement());

		Vector<Integer> vc = new Vector<Integer>();
		vc.addAll(stack2);
		System.out.println(vc);
		
		System.out.println(vc.subList(0, 3));
		System.out.println(vc.containsAll(stack2));
		System.out.println(vc.capacity());
		System.out.println(vc.contains(2500));
		System.out.println(vc.equals(stack2));
		System.out.println(vc.hashCode());
		System.out.println(vc.indexOf(168));

	}
}
