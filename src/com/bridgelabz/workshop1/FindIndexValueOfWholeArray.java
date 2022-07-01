package com.bridgelabz.workshop1;

import java.util.Arrays;

public class FindIndexValueOfWholeArray {

	public static void main(String[] args) {
		int array[] = new int[] { 5, 9, 3, 7, 10, 55, 77 };
		int index[] = new int[] { 0, 1, 1, 2, 3, 5 };
		int[] newArray = new int[index.length];

		for (int i = 0; i < index.length; i++) {
			newArray[i] = array[index[i]];
//				System.out.print(newArray[i]+" ");
		}

		System.out.print(Arrays.toString(newArray));
	}
}
