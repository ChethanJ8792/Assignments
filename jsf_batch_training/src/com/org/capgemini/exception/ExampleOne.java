package com.org.capgemini.exception;

import java.util.Scanner;

public class ExampleOne {

	public static void main(String[] args) {
		//Taking i/p from scanner class
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 2 numbers");
		int numberOne=sc.nextInt();
		int numberTwo=sc.nextInt();
		//Using try,catch block we are handling exception
		int result=(numberOne/numberTwo);
		System.out.println(result);
		System.out.println("Number cannot be divided by zero");
		sc.close();
	}

}
