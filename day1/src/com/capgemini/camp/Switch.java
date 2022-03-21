package com.capgemini.camp;
import java.util.*;
public class Switch {
	public static void main(String[] args) 
	{
	 Scanner sc=new Scanner(System.in);
     System.out.println("enter month-- first 3 digits of a mont ex jan feb");
     String str=sc.nextLine();
     int days;

     switch(str)
     {
     case "feb":
    	days =28;
    	 break;
     case "apr":
     case "jun":
     case "aug":
     case "oct":
     case "dec":
   	  days =30;
   	  break;
     case "jan":
     case "mar":
     case "may":
     case "july":
     case "sept":
     case "nov":
   	  days =31;
   	  break;
    default: days=-1;
    break;
     }
    System.out.println("month "+str+" has "+days+" days");
}
}