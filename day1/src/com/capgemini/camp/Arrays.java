package com.capgemini.camp;
import java.util.*;
public class Arrays {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Array Size");
		int n = sc.nextInt();
		int a[] = new int[n];
		System.out.println("Enter Array Elements");
		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();

		}
		System.out.println("The array elements are");
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);

		}
		System.out.println("Even or Odd");
		for (int i = 0; i < a.length; i++) {
			if (a[i] % 2 == 0)
				System.out.println(a[i] + " is EVEN");
			else
				System.out.println(a[i] + " is ODD");
		}
		int max = a[0], min = a[0];
		for (int i = 0; i < a.length; i++) {
			if (a[i] > max)
				max = a[i];
			if (a[i] < min)
				min = a[i];
		}
		System.out.println(max + "is max number...");
		System.out.println(min + "is min number...");
	}
}
