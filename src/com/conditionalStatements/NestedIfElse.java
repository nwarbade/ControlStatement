package com.conditionalStatements;

public class NestedIfElse {
	
	public static void main(String[] args) {
		
		System.out.println("Even, odd or negative");
		
		int a = 6;
		
		if (a>0) {
			System.out.println("number is +ve");
			
			if(a%2 == 0) {
				System.out.println("number is even number");
			}
			else {
				System.out.println("number is odd");
			}
		}
		else {
			System.out.println("its -ve nummber");
		}
	}

}
