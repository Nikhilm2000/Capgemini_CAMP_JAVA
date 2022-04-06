package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.User;

@RestController

public class MyController {
	@GetMapping("/shello")
	public ResponseEntity<String> sayHello(){
		HttpHeaders headers=new HttpHeaders();
		String msg="Hello nikhil";
		headers.add("desc","hello user");
        return new ResponseEntity<String>(msg, headers, HttpStatus.OK);
    }
    
    @GetMapping("/userss")
    public ResponseEntity<List<User>> getUsers() {
        List<User> users=new ArrayList<User>();
        users.add(new User(1, "A"));
        users.add(new User(2, "B"));
        users.add(new User(3, "C"));
        HttpHeaders headers=new HttpHeaders();
        headers.add("responded", "UserController");
        return ResponseEntity.accepted().headers(headers).body(users);
    }
    
    @GetMapping("/users")
    public ResponseEntity<User> getUser() {
        User user=new User(1,"A");
        HttpHeaders headers=new HttpHeaders();
        headers.add("desc", "UserDetails");
        return ResponseEntity.status(HttpStatus.OK).headers(headers).body(user);
    }
    
}
