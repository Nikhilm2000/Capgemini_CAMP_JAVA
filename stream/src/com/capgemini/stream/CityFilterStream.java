package com.capgemini.stream;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CityFilterStream{
	public static void main(String[] args) {
	List<String> cities=Arrays.asList("Mumbai","Chennai","Delhi","Kolkata","Hyderabad","Bangalore","Pune","Agra","Ahmedabad");
	System.out.println("All Cities");
	for(String city:cities) {
		System.out.println(city);
	}
	Stream<String> stream=cities.stream();
	 stream=stream.filter(city->city.startsWith("M"));
	 List<String> filteredCities=stream.collect(Collectors.toList());
	 System.out.println("Cities Which Starts With M");
	 filteredCities.forEach(city->System.out.println(city));
	
	
	
	}

}

