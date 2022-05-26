package com.org.capgemini.datastructures;
public class AmrstrongNumberInBetween {

	public static void main(String[] args) {
		//For loop will check condition and work on increment
				for(int number=100;number<=999;number++)
				{
				//divide and take them individually
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
					System.out.println(number+ " => is an  Amstrong number ");
				}
				}	
	}

}
