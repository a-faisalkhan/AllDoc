package com.bridgelabz.workshop1;

public class PatternAABABC {
	public static void main(String[] args) {
		int alphabet = 65;
		for (int i = 0; i <= 5; i++) {
			for (int j = 0; j <= i; j++) {
				//System.out.print((char) (alphabet + i) + " "); print A BB CCC ..
				System.out.print((char) (alphabet + j) + " "); //print A AB ABC ..
			}
			System.out.println();
		}
	}

}
