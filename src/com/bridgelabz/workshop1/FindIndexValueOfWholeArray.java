package com.bridgelabz.workshop1;

import java.util.Arrays;

public class FindIndexValueOfWholeArray {

	public static void main(String[] args) {
		//int n = 5;
		int array[] = new int[] { 5, 9, 3, 7, 10 };
		int index[] = new int[] { 0, 1, 1, 2, 3 };
		
//		for (int i = 0; i < array.length; i++) {
//			array[i] = n;
//		}
//		for (int i = 0; i < index.length; i++) {
//			index[i] = n;
//		}
		for (int i = 0; i < index.length; i++) {
			while (index[i] != i) // keep looping till index[i] is not equal to actual index
			{
				array[i] = array[i] + array[index[i]] - (array[index[i]] = array[i]);
				index[i] = index[i] + index[index[i]] - (index[index[i]] = index[i]);
			}
		}
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println();
	}

}
