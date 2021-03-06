package com.capgemini.day5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

public class Arraylist {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList list = new ArrayList();
		list.add(100);
		list.add("Nikhil");
		list.add(25400.00);
		list.add(25);

		System.out.println(list);
		
		// using for to iterate through list
		for (Object ls : list) {
			System.out.println(ls);
		}

		// ArrayList for Integers
		ArrayList<Integer> list2 = new ArrayList<Integer>();
		list2.add(45);
		list2.add(00);
		list2.add(94);
		list2.add(56);
		list2.add(12);
		
		Iterator<Integer> it=list2.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		// list.get
		System.out.println("List.get of index value 1----" + list.get(1));
		System.out.println("List.get of index value 2----" + list2.get(2));
		// list.contains
		System.out.println("check if List contains vlaue--Nikhil ----" + list.contains("Nikhil"));
		System.out.println("check if List2 contains vlaue--567 ----" + list2.contains(567));
		// list.indexOf
		System.out.println("returns the index value of 25  ----" + list.indexOf(25));
		System.out.println("returns the index value of 0  ----" + list2.indexOf(0));

		// display sorted list2
		Collections.sort(list2);
		System.out.println("Collections.sort is used to sort list   ----" + list2);
		Collections.sort(list2, Collections.reverseOrder());
		System.out.println("Collections.sort is used to sort list in descending order  ----" + list2);
		// clear list2
		list2.clear();
		System.out.println("list.clear is used to remove all list elemnts  ----" + list2);
		// list,remove
		System.out.println("list.remove is used to remove a value at the index given  ----" + list);
		list.remove(0);
		list.remove(2);
		System.out.println(list);
		
		ArrayList list3=new ArrayList();
		list3.addAll(list);
		System.out.println(list3);
		
		list3.removeAll(list);
		System.out.println(list3);

		System.out.println(list3.isEmpty());
	}

}
