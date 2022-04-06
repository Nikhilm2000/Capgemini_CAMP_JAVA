package com.capgemini.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CityFilter {
	public static List<String> getFilterCities(List<String>cities,String filter){
		List<String>filteredCities=new ArrayList<String>();
		for(String city:cities) {
			if(city.startsWith("B"))
				filteredCities.add(city);
		}
		return filteredCities;
	}
	public static void main(String[] args) {
		List<String> cities=Arrays.asList("Mumbai","Chennai","Delhi","Kolkata","Hyderabad","Bangalore","Pune","Agra","Ahmedabad");
	List<String>filterCities=	getFilterCities(cities, "A");
	System.out.println("All Cities");
	for(String city:cities) {
		System.out.println(city);
	}
	System.out.println("Cities Which Starts With B");
	for(String city:filterCities) {
		System.out.println(city);
	}
	
	
	}

}
