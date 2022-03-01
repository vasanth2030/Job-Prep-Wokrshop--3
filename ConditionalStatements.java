package com.vasanth.BasicJava;

import java.util.Scanner;

public class ConditionalStatements {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Start of program");
		System.out.println();
//		System.out.println("Enter a number: ");
//		int number = sc.nextInt();
//		
//		oddOrEven(number);
		
		
		System.out.println("Enter two numbers: ");
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		
		int res=sum(num1,num2);
		
		System.out.println("The sum of "+num1+" and "+num2+" is "+res);
		
		System.out.println();

		System.out.println("End of program.");

	}

	public static void oddOrEven(int n) {
		if (n == 0) {
			System.out.println("You have entered zero");
		} else if (n % 2 == 0) {

			System.out.println("Even number");

		} else {
			System.out.println("Odd Number");
		}

	}
	
	public static int sum(int a,int b)
	{
		int sum=a+b;
		return sum;
	}


}
