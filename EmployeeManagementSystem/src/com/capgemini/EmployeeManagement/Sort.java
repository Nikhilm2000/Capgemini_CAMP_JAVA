package com.capgemini.employeemanagement;

import java.util.Scanner;

public class Sort {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String[] arr = { "Arjun", "Zulfi", "Manish", "Nikhil", "Bharath", "Pavan" };
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if (arr[j].compareTo(arr[i]) > 0) {
					String tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;
				}
			}
			
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		System.out.println("Enter the name to be searched");
		String str=sc.next();
		
		for (int i = 0; i < arr.length; i++) {
			
			if(arr[i].equals(str)) {
				System.out.println(arr[i].equals(str));
				System.out.println(str+"is found at index  "+i);
				break;
			}
			else System.out.println("Not found");
			sc.close();
		}
	}
}