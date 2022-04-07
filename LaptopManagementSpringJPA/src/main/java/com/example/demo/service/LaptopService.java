package com.example.demo.service;

import java.util.ArrayList;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.Laptop;
import com.example.demo.repository.LaptopRepository;


@Service
public class LaptopService {
	@Autowired
	LaptopRepository laptopRepository;

	public List<Laptop> getAllLaptop() {
		List<Laptop> laptop = new ArrayList<Laptop>();
		laptopRepository.findAll().forEach(laptop1 -> laptop.add(laptop1));
		return laptop;
	}

	public Laptop getLaptopById(int id) {
		return laptopRepository.findById(id).get();
	}

	public void saveOrUpdate(Laptop laptop) {
		laptopRepository.save(laptop);
	}
 
	public void delete(int id) {
		laptopRepository.deleteById(id);
	}

	public void update(Laptop laptop, int laptopid) {
		laptopRepository.save(laptop);
	}
}
