package com.org.capgemini.strings;

public class MethodOverloading {

	public static void main(String[] args) {
		MethodOverloading method=new MethodOverloading();
		method.add(10,30);
		
	}//This will execute because first priority goes to int.
	public void add(int a,int b)
	{
		System.out.println("this is int "+(a+b));
	}
	public void add(double a,double b)
	{
		System.out.println("this is double"+(a+b));
	}
	public void add(Integer a,Integer b)
	{
		System.out.println("this is Integer"+(a+b));
	}
}
