package com.capgemini.employeemanagement;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Scanner;
import java.util.Date;

public class EmployeeManagement {
//Array
	public static void main(String[] args) {
		// Array of object
		Employee[] list = new Employee[10];

		list[0] = new Employee(101, "Rohith", 2800.0, "2022/10/14");
		list[1] = new Employee(102, "Nikhil", 4900.0, "2021/08/28");
		list[2] = new Employee(103, "Mallik", 5400.0, "2022/01/19");
		list[3] = new Employee(104, "Pavan", 8800.0, "2021/10/14");
		list[4] = new Employee(105, "Arjun", 2400.0, "2022/08/14");
		list[5] = new Employee(106, "Sharma", 1900.0, "2021/02/28");
		list[6] = new Employee(107, "Zulfi", 3400.0, "2022/01/15");
		list[7] = new Employee(108, "Bharath", 2200.0, "2021/01/14");
		list[8] = new Employee(109, "Kishan", 2000.0, "2022/01/14");
		list[9] = new Employee(110, "Ishan", 3900.0, "2021/03/28");

		int counter = 0;
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("Enter Choice !");
			System.out.println("Press 1 for Adding Employee Details ");
			System.out.println("Press 2 for Creating New Employee List  ");
			System.out.println("Press 3 to Modify Employee Details ");
			System.out.println("Press 4 to Print maximum salary of Employee ");
			System.out.println("Press 5 to Print minimum salary of Employee ");
			System.out.println("Press 6 to Print Sort the Name of Employee ");
			System.out.println("Press 7 to Print Sort the salary of Employee ");
			System.out.println("Press 8 to Display");
			System.out.println("Press 9 Exit");
			int choice = sc.nextInt();

			switch (choice) {
			case 1:
				System.out.println("Enter the employee name");
				String name = sc.next();

				System.out.println("Enter the employee id");
				int id = sc.nextInt();

				System.out.println("Enter the employee salary");
				double salary = sc.nextDouble();

				DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
				Date date = new Date();
				String newdate = dateFormat.format(date);
				Employee employee = new Employee(id, name, salary, newdate);
				list[counter] = employee;
				counter = counter + 1;
				break;
			case 2:
				Employee[] list2 = new Employee[4];
				list2[0] = new Employee(101, "Mike", 2400.0, "2022/05/14");
				list2[1] = new Employee(102, "Nikhil", 2900.0, "2021/08/08");
				list2[2] = new Employee(103, "Mallik", 3400.0, "2022/01/25");
				list2[3] = new Employee(104, "Pavan", 2800.0, "2021/04/24");
				for (Employee e : list2) {

					System.out.println(" List2 Employees are :" + e);
				}
				break;

			case 3:
				System.out.println("Enter index value of employee to be modified");
				int i = sc.nextInt();
				System.out.println("Which field you want to modify 1:ID 2:Name 3:salary ");
				int ch = sc.nextInt();
				if (ch == 1) {
					System.out.println("Enter new emp id to change");
					int nid = sc.nextInt();
					list[i].id = nid;
				} else if (ch == 2) {
					System.out.println("Enter new emp name to change");
					String nname = sc.next();
					list[i].name = nname;
				} else if (ch == 3) {
					System.out.println("Enter  emp salary to change");
					double nsalary = sc.nextDouble();
					list[i].salary = nsalary;
				}
				for (Employee e : list) {
					System.out.println("After Modification" + e);
				}

				break;
			case 4:
				double maxvalue = 0.0;
				for (int j = 0; j < list.length; j++) {
					if (list[j].salary > maxvalue) {
						maxvalue = list[j].salary;
					}
				}
				System.out.println(maxvalue);

				break;
			case 5:
				double minvalue = 99999.99;
				for (int k = 0; k < list.length; k++) {
					if (list[k].salary < minvalue) {
						minvalue = list[k].salary;
					}
				}
				System.out.println(minvalue);
				break;
			case 6:
				for (int m = 0; m < list.length; m++) {
					for (int n = 0; n < list.length; n++) {
						if ((list[n]).compareTo(list[m]) > 0) {
							String tmp = list[m].name;
							list[m].name = list[n].name;
							list[n].name = tmp;
						}
					}
				}
				for (Employee e : list) {
					System.out.println(e.name);
				}
				break;
			case 7:
				for (int x = 0; x < list.length; x++) {
					for (int y = x + 1; y < list.length; y++) {
						double tmp;
						if (list[x].salary > list[y].salary) {
							tmp = list[x].salary;
							list[x].salary = list[y].salary;
							list[y].salary = tmp;
						}
					}
				}
				for (Employee e : list) {
					System.out.println(e.salary);
				}
				break;

			case 8:
				for (Employee e : list) {
					System.out.println(e);
				}
				break;
			case 9:
				break;
			default:
				System.out.println("Enter a valid choice");
			}
			sc.close();

		}
	}

}
