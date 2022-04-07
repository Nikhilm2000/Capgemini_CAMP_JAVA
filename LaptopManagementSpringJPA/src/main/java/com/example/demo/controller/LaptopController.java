package com.example.demo.controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.Laptop;
import com.example.demo.service.LaptopService;

@RestController
public class LaptopController {

	@Autowired
	LaptopService laptopService;

	@GetMapping("/laptop")
	private List<Laptop> getAllBooks() {
		return laptopService.getAllLaptop();
	}

	@GetMapping("/laptop/{laptopid}")
	private Laptop getLaptop(@PathVariable("laptopid") int laptopid) {
		return laptopService.getLaptopById(laptopid);
	}

	@DeleteMapping("/laptop/{laptopid}")
	private void deleteLaptop(@PathVariable("laptopid") int laptopid) {
		laptopService.delete(laptopid);
	}

	@PostMapping("/laptops")
	private long saveLaptop(@RequestBody Laptop laptop) {
		laptopService.saveOrUpdate(laptop);
		return laptop.getId();
	}
  
	@PutMapping("/laptops/{laptopid}")
	private Laptop update(@RequestBody Laptop laptop,@PathVariable("laptopid") int laptopid) {
		laptopService.update(laptop,laptopid);
		return laptop;
	}
}
