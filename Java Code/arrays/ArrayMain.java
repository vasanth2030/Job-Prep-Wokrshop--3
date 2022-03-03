package com.vasanth.arrays;

import java.util.Scanner;

public class ArrayMain {
	
	public static void main(String[] args) {
//		System.out.println("Enter the size of the array: ");
//		int n =sc.nextInt();
//		int arr[]=new int[n];
//		
//		for(int i=0;i<n;i++)
//		{
//			System.out.println("Enter the value: ");
//			arr[i]=sc.nextInt();
//		}
//	
//		printArray(arr);	

		
//		int ans = largestElement(arr);
//		System.out.println("The largest element is "+ans);
//		
//		int sum=sumOfElements(arr);
//		System.out.println("Sum of elements in the array is "+sum);
		
		
		Scanner sc=new Scanner(System.in);
		int arr[]= {10,30,60,40,20,70,90,80,100};
		System.out.println("Enter the element to search: ");
		int n=sc.nextInt();
		
		linearSearch(arr, n);
		
		
		
		
		
		
		
	}
	
	public static void printArray(int arr[])
	{
		int n=arr.length;
		
		for(int i=0;i<n;i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	
	public static int largestElement(int arr[])
	{
		int max=arr[0];
		for(int i=1;i<arr.length;i++)
		{
			if(arr[i]>max)
				max=arr[i];
		}
		
		return max;
	}
	
	public static int sumOfElements(int arr[])
	{
		int sum=0;
		for(int i=0;i<arr.length;i++)
		{
			sum+=arr[i];             // sum= sum+arr[i]
		}
		return sum;
	}
	
	public static void linearSearch(int arr[],int n)
	{
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==n)
			{
				System.out.println("Element found at index "+i);
				return;
			}
		}
		
		System.out.println("Element not found.");
	}
	

}
