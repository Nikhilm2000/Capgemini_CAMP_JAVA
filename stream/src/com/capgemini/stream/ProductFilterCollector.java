package com.capgemini.stream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.Collectors;


class Product {
	private int id;
    private String name;
    private double price;
	public Product(int id, String name, double price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", price=" + price + "]";
	}
	
}


public class ProductFilterCollector {

	public static void main(String[] args) {
List<Product>productList=Arrays.asList(new Product(1, "RealMe Mobile", 15000),
										new Product(2, "Samsung Mobile", 20000),
										new Product(3, "Sony  Mobile", 30000),
										new Product(4, "Nokia  Mobile", 10000),
										new Product(5, "Oppo  Mobile", 10000));

List<String>prodListName = productList.stream() 
.map(prod->prod.getName())
.collect(Collectors.toList());
Double sumPrices =  productList.stream() 
.collect(Collectors.summingDouble(prod->prod.getPrice()));
System.out.println("Sum of prices: "+sumPrices);  
prodListName.forEach(name->System.out.println(name));	
}

}

