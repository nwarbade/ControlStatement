package com.conditionalStatements;

public class NestedIf {
	
	public static void main(String[] args) {
		
		System.out.println("Welcome to Blood donation camp");
		
		int age = 18;
		int weight = 55;
		
		if (age >= 18) {
			
			System.out.println("condition 1 is satisfied");
			
			if ( weight >= 50) {
				
				System.out.println("condition 2 is satisfied");
				System.out.println("You are elegible to blood donation");
			}
		}
		
		else {
			System.out.println("you are not eligible to donate blood");
		}
	}

}
