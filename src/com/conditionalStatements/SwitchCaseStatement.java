package com.conditionalStatements;

public class SwitchCaseStatement {
	
	public static void main(String[] args) {
		
		char c = 'i';
		switch(c) {
		
		case 'a':
			System.out.println(c+ " is a vowel"); break;
			
		case 'e':
			System.out.println(c+ "is a vowel"); //break;
			
		case 'i':
			System.out.println(c+ " is a vowel"); break;
			
		case 'o':
			System.out.println(c+ " is a vowel"); break;
			
		case 'u':
			System.out.println(c+ " is a vowel"); break;
			
		default:
				System.out.println(c+ " is not vowel");
			
		}
	}
	}
