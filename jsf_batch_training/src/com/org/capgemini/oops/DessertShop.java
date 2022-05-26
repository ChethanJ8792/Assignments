package com.org.capgemini.oops;

import java.util.Scanner;

public class DessertShop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       System.out.println("Welcome to Dessert Shop");
       System.out.println("Select your option \n1.Add Items \n 2.Place order");
       Scanner sc=new Scanner(System.in);
       int num=sc.nextInt();
       if(num==1) {
    	   System.out.println("Add Items");
    	  
       }
       else if(num==2) {
    	   System.out.println("Place Order");
    	   System.out.println("Enter your name: ");
    	   String name=sc.next();
    	   System.out.println("Enter your age: ");
    	   int age=sc.nextInt();
    	   System.out.println("Enter your address: ");
    	   String address=sc.next();
    	   System.out.println("Enter your Mobile number: ");
    	   long contact=sc.nextLong();
    	   System.out.println("ok, Order is placed successfully");
       }
	}

}