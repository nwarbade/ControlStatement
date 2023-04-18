package com.jumpStatements;

public class Continue {   //"continue": This statement is used to skip the current iteration of a loop and move to the next one.

	public static void main(String[] args) {
		for(int i =1; i<=10; i++) {
			if(i%2==0) {
				continue;
			}
			System.out.println(i);
		}
	}
}
