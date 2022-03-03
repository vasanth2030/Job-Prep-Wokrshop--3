package com.vasanth.BasicJava;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class ExceptionHandling {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two values: ");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();

		try {
			division(num1, num2);
			System.out.println("Inside try block");
		} catch (ArithmeticException exc) {
			System.out.println(exc);
			System.out.println("Inside catch block");
			System.out.println("Please enter a non zero divisor");
		}finally {
			System.out.println("Inside finally block.");
		}
		
		System.out.println();
		System.out.println("End of program");
		
	}

	public static void division(int a, int b) throws ArithmeticException {
		int div = a / b;
		System.out.println("The value after division is: " + div);
	}

}
