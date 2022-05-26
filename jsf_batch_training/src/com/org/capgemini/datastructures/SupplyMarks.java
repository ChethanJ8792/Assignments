package com.org.capgemini.datastructures;

import java.util.Scanner;

public class SupplyMarks {

	public static void main(String[] args) {
		//Supply marks
		//Scanner sc=new Scanner(System.in);
		//System.out.println("Enter marks");
		Scanner sc=new Scanner(System.in);
		int SubjectOne=sc.nextInt();
		int SubjectTwo=sc.nextInt();
		int SubjectThree=sc.nextInt();
		if(SubjectOne>60&SubjectTwo>60&SubjectThree>60)
		{
			System.out.println("Passed");
		}
		else if(SubjectOne>60&&SubjectTwo>60||SubjectThree>60)
		{
			System.out.println("promoted");
		}
		else if(SubjectOne>60||SubjectTwo>60||SubjectThree>60||SubjectOne<60&&SubjectTwo<60&&SubjectThree<60)
		{
			System.out.println("Failed");
		}
		
		sc.close();
		
	}

}
