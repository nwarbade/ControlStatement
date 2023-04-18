package com.jumpStatements;

public class Break {      //"break": This statement is used to terminate the execution of a loop or switch statement. 
	
	public static void main(String[] args) {
		
		for(int i=1; i<=10;i++) {
			
			if (i==5) {
				
				break;
			}
			System.out.println(i);
		}
	}

}
