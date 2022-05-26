package com.org.capgemini.datastructures;

import java.util.Scanner;

public class CUIBasedApplication {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc =new Scanner(System.in);
		//taking dynamic i/p
		int attempts;
		for(attempts=1;attempts<=3;attempts++)
		{
			//taking user and password
		System.out.println("Enter user");
		String user=sc.next();
		System.out.println("Enter password =>should  only numeric");
		int password=sc.nextInt();
		System.out.println("User :"+ user);
		System.out.println("Password :"+password);
		System.out.println("Succesfully logged");
		//This loop will continue for 3 attempts then it will terminate
		}
		//After termination this will be printed
		if(attempts>=3) {
		System.out.println("Contact Admin");
		}
		sc.close();
	}
	
}
