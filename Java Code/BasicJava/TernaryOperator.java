package com.vasanth.BasicJava;

import java.util.Scanner;

public class TernaryOperator {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n=sc.nextInt();
		
		String result;
		
//		if(n%2==0)
//			result="Even number.";
//		else
//			result="Odd number.";
		
		result = (n%2==0) ? "Even number." : "Odd number.";
				
		System.out.println(n+" is a "+result);
	}

}
