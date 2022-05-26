package com.org.capgemini.datastructures;

import java.util.Scanner;

public class AmstrongNumber {

	public static void main(String[] args) 
	{
		//Scanner will take i/p from the user dynamically
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter 3 digit number to validate Amstrong Number");
		//fivide and take them individually
		int number=scanner.nextInt();
		int number1=number%10;
		//System.out.println(number1);
		int num=number%100;
		int number2=num/10;
		//System.out.println(number2);
		int numb=number/10;
		int number3=numb/10;
		//System.out.println(number3);
		//
		
		//cubing all digits
		int cube1=number1*number1*number1;
		int cube2=number2*number2*number2;
		int cube3=number3*number3*number3;
		int res=cube1+cube2+cube3;
		//Checking condition if both i/p and o/p are same then it is an amstrong number
		if(number==res)
		{
			System.out.println("It is Amstrong number");
		}
		else
		{
			System.out.println("Not an amstrong number");
		}
		scanner.close();
	}

}
