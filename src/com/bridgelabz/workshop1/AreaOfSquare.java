package com.bridgelabz.workshop1;

import java.util.Scanner;

public class AreaOfSquare {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the area length");
		int length = scanner.nextInt();
		System.out.println("Enter the area Breadth");
		int breadth = scanner.nextInt();

		if (length == breadth) {
			System.out.println("It is square");
		}else {
			System.out.println("It is not a square");
		}
	}
}
