package com.bridgelabz.workshop1;

public class ReverseArray {

	public static void main(String[] args) {

		int[] array = new int[] { 5, 2, 8, 1, 7 };

		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		
		System.out.println();
		System.out.println("Reverse array is: ");
		for(int i = array.length-1; i >= 0; i--) {
			System.out.print(array[i] + " ");
		}
	}
}
