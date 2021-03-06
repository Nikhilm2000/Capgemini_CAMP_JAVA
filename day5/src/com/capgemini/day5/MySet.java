package com.capgemini.day5;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class MySet {

	public static void main(String[] args) {

		// HashSet
		HashSet<Integer> set = new HashSet<Integer>();
		set.add(25);
		set.add(15);
		set.add(25);
		set.add(9);
		set.add(30);
		set.add(9);
		set.add(10);

		System.out.println(set);
		System.out.println(set.contains(25));

		HashSet<Integer> set1 = new HashSet<Integer>();
		set1.add(22);
		set1.add(30);
		set.add(100);

		System.out.println(set.containsAll(set1));

		set.addAll(set1);
		System.out.println(set);

		System.out.println(set.containsAll(set1));

		System.out.println(set.equals(set1));

		set.removeAll(set1);
		System.out.println(set);

		set1.clear();
		System.out.println(set1.isEmpty());

		System.out.println(set.size());
		Iterator<Integer> it = set.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}

		LinkedHashSet<Integer> lhs = new LinkedHashSet<Integer>();
		lhs.add(25);
		lhs.add(15);
		lhs.add(25);
		lhs.add(9);
		lhs.add(30);
		lhs.add(9);
		lhs.add(10);
		
		System.out.println(lhs);// LinkedHashSet maintains the insertion order
		HashSet<Integer> set2 = new HashSet<Integer>();
		set2.add(22);
		set2.add(39);
		set2.add(2);
		set2.add(40);
		set2.add(98);
		set2.add(74);

		lhs.addAll(set2);
		System.out.println(lhs);
		
		System.out.println(lhs.containsAll(set1));
		System.out.println(lhs.getClass());
		System.out.println(lhs.hashCode());
		System.out.println(lhs.isEmpty());
		lhs.remove(2);
		System.out.println(lhs.toString());
	
		//TreeSet
		TreeSet<Integer> tree = new TreeSet<Integer>();
		tree.addAll(lhs);
		
		Iterator<Integer> it1 = tree.iterator();
		System.out.println("Ascending order");
		while (it1.hasNext()) {
			System.out.println(it1.next());
		}

		Iterator<Integer> its = tree.descendingIterator();
		System.out.println("Descending order");
		while (its.hasNext()) {
			System.out.println(its.next());
		}

	}

}
