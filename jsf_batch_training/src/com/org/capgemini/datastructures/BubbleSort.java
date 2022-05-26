package com.org.capgemini.datastructures;

public class BubbleSort {

	public static void main(String[] args) {
		//taking static i/p array
	int arr[]= {5,12,14,6,78,19,1,23,26,35,37,7,52,86,47};
		int n=arr.length;
		int temp=0;	
		//using for
		for(int i=0;i<n;i++) {
			for(int j=1;j<(n-i);j++) {
				if(arr[j-1]>arr[j]) {
					//swap element using nested for loops
					temp=arr[j-1];
					arr[j-1]=arr[j];
					arr[j]=temp;
				}
			}
		}
		System.out.println("Array after sorting: ");
		System.out.print("[");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		
		System.out.print("]");
	}

}
