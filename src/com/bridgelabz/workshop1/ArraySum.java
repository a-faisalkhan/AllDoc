package com.bridgelabz.workshop1;

public class ArraySum {

	public static void sum1() {

		int[] array = new int[] { 5, 6, 3, 7, 9 };
		int sum = 0;
		int i;

		for (i = 0; i < array.length; i++) {
			sum = sum + array[i];
		}
		System.out.println("Sum of array is: " + sum);
	}

	public static void main(String[] args) {
		// ArraySum.sum1();
		sum1();

	}

}
