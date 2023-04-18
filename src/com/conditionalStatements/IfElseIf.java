package com.conditionalStatements;

public class IfElseIf {
	
	public static void main(String[] args) {
		
		int salary = 10000;
		
		if (salary > 9000 && salary >= 110000) {
			
			System.out.println("i will buy mobile");
		}
		
		else if (salary > 7000 && salary >= 19000) {
			
			System.out.println(" i will buy camera");
		}
	
		else if (salary > 5000 && salary >= 17000) {
			
			System.out.println("i will buy battery");
		}
		
		else {
			
			System.out.println("insufficient salary");
		}
	
	}

}
