package com.bridgelabz.workshop1;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {

		double number1, number2;
		Scanner input = new Scanner(System.in);
		System.out.println("Select the operation (+, -, *, /)");
		char operator = input.next().charAt(0);
		System.out.println("Enter the first number: ");
		number1 = input.nextDouble();
		System.out.println("Enter the second number: ");
		number2 = input.nextDouble();

		switch (operator) {
		case '+':
			System.out.println("Answer is: "+ (number1 + number2));
			break;

		case '-':
			System.out.println("Answer is: "+ (number1 - number2));
			break;

		case '*':
			System.out.println("Answer is: " + (number1 * number2));
			break;

		case '/':
			if (number2 != 0)
				System.out.println("Answer is: "+ (number1 / number2));
			else
				System.out.println("infinite value");
			break;
		default:
			System.out.println("Invalid operator");
		}
	}

}
