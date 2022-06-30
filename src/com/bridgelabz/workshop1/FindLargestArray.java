package com.bridgelabz.workshop1;

public class FindLargestArray {

	public static int findLargest(int[] a, int total) {
		int temp;
		for (int i = 0; i < total; i++) {
			for (int j = i + 1; j < total; j++) {
				if (a[i] > a[j]) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		return a[total - 1];
	}

	public static void main(String args[]) {
		int a[] = { 2, 6, 8, 6, 7 };
		int[] b = new int[] { 5, 0, -5, 98, 712, 100 };
		System.out.println("Largest: " + findLargest(a, 5));
		System.out.println("Largest: " + findLargest(b, 6));

	}

}
