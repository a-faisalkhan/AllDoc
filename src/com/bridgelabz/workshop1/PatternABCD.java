package com.bridgelabz.workshop1;

public class PatternABCD {

	public static void main(String[] args) {

		int i, j;
		int alphabet = 65;
		for (i = 1; i < 5; i++) {
			for (j = 1; j <= i; j++) {
				System.out.print((char) alphabet + " ");
				// alphabet++;
			}
			alphabet++;
			System.out.println();
		}

	}

}
