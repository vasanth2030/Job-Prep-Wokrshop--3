package com.vasanth.BasicJava;

import java.util.Scanner;

public class LoopsInJava {
	
	public static void main(String[] args) {
	
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a name: ");
		String s= sc.nextLine();
		System.out.println("Enter how many times do you want to repeat it: ");
		int n = sc.nextInt();
		
//		int i=1;
		
//		while(i<=n)
//		{
//			System.out.println(s+ " "+i);
//			i++;
//		}
		
//		do {
//			System.out.println(s);
//			
//		}while(i>10);
		
	
		for(int i=0;i<n;i++)
		{
			System.out.println(s+" "+i);
		}
		
		
		System.out.println();
		System.out.println("End of program.");
		
	}

}
