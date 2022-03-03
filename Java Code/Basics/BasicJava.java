package com.vasanth.BasicJava;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class BasicJava {

	public static void main(String[] args) throws Exception {

		// Buffered Reader and Scanner

		String name;
		int age;
		float height;
		char gender;

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter your name: ");
		name = br.readLine();

		System.out.println("Enter our age: ");
		age = Integer.parseInt(br.readLine());

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter your height: ");
		height = sc.nextFloat();

		System.out.println("Enter your gender: ");
		gender = sc.next().charAt(0);

		System.out.println("Name: " + name);
		System.out.println("Age: " + age);
		System.out.println("Height: " + height);
		System.out.println("Gender: " + gender);

	}

}
