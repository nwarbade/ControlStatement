package com.conditionalStatements;

public class NestedIf2 {         //finding largest number
	
	public static void main(String[] args) {
		
		int num1 = 10, num2 = 5, num3 = 20, largestNumber;
		
		        if (num1 >= num2) {
		        	
		            if (num1 >= num3) {
		                largestNumber = num1;
		            } 
		            else {
		                largestNumber = num3;
		            }
		        } 
		        
		        else {
		            if (num2 >= num3) {
		                largestNumber = num2;
		            } 
		            
		            else {
		                largestNumber = num3;
		            }
		        }
		        System.out.println("Largest number is: " + largestNumber);
		    }
			}

