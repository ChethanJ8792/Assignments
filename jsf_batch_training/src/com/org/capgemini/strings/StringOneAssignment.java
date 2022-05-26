package com.org.capgemini.strings;

public class StringOneAssignment {

	public static void main(String[] args) {
		//1)It will take i/p.
		String string="Hello World";
		//length method will print the length of the string including space.
		System.out.println(string.length());
		String string1="Hello ";
		String string2="How are you?";
		//2)there are 2 ways to print the below
		System.out.println(string1.concat(string2));
		System.out.println(string1+string2);
		//3)
		String ss=new String("Java String pool refers to collection of Strings which are stored in heap memory");
		System.out.println("LowerCase : "+ss.toLowerCase());
		System.out.println("UpperCase : "+ss.toUpperCase());
		System.out.println("After Replacing a : "+ss.replace('a','$'));
		System.out.println("Chceking for word collection : "+ss.contains("collection"));
		System.out.println("Matches the original : "+ss.equals("Java String pool refers to collection of Strings which are stored in heap memory"));
		
	
	}

}
