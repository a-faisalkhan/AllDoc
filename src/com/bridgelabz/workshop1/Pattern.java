package com.bridgelabz.workshop1;

public class Pattern {

	public static void main(String[] args) {
		int i, j;
		for(i = 0; i < 5; i++) {
			for(j = 0; j <= 5; j++) { //j <= i for printing pyramid
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
