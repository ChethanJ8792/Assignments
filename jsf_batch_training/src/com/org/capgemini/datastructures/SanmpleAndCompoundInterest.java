package com.org.capgemini.datastructures;

import java.util.Scanner;

public class SanmpleAndCompoundInterest {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the principle");
		double n1=sc.nextDouble();
		System.out.println("Enter the rate: ");
		double rate=sc.nextDouble();
		System.out.println("Enter the time: ");
		double t=sc.nextDouble();
	    
		double interest = (n1 * t * rate) / 100;

	    System.out.println("Principal: " + n1);
	    System.out.println("Interest Rate: " + rate);
	    System.out.println("Time Duration: " + t);
	    System.out.println("Simple Interest: " + interest);
	    sc.close();

	}

}

		