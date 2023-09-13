package org.lessons.java;

import java.util.Scanner;

public class CalcolaBiglietto {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("How many kilometers do you have to travel?");
		int km = sc.nextInt();
		
		System.out.print("How old are you?");
		int age = sc.nextInt();
		
		sc.close();
		
		double price = 0.21;
		
		if (age < 18) {
			double youngPrice = km * price * 0.8;
			String formattedYoungPrice = String.format("%.02f", youngPrice);
			System.out.println("The price of your ticket is " + formattedYoungPrice);
		} else if (age>65) {
			double oldPrice = km * price * 0.6;
			String formattedOldPrice = String.format("%.02f", oldPrice );
			System.out.println("The price of your ticket is " + formattedOldPrice);
		} else {
			double normalPrice = km * price;
			String formattedNormalPrice = String.format("%.02f", normalPrice );
			System.out.println("The price of your ticket is €" + formattedNormalPrice);
		}
		
	}

}
