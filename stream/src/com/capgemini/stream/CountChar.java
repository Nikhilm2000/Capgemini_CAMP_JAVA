package com.capgemini.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.*;

class CountChar{

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		Stream.of(str.toLowerCase().split("")).collect(Collectors.groupingBy(e -> e, Collectors.counting())).entrySet()
				.stream().map(e -> e.getKey() + e.getValue() + " ")
				.forEach(System.out::print);
	}
}
