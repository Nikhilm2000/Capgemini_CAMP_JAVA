package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.entity.Student;

@RestController
public class StudentController {
	@GetMapping("/std")
	public Student getStudent() {
		return new Student("Nikhil",1200);
	}
		
		@GetMapping("/students")
		public List<Student> getStudents() {
			List<Student> studList=new ArrayList<Student>();
			studList.add(new Student("Shubham", 1201));
			;
			studList.add(new Student("Rohit", 1202));
			studList.add(new Student("Virat", 1203));
			studList.add(new Student("Shikhar", 1204));
			studList.add(new Student("Sachin", 1205));
			
			return studList;
		}
	
}
