package com.bridgelabz.workshop1;

public class findLargestFromArrayMethod {

	static int arr[] = {12, 35, 5, 64, 98};

	// Method to find maximum in arr[]
	static int largest() {

		// Initialize maximum element
		int max = arr[0];

		// Traverse array elements from second and
		// compare every element with current max
		for (int i = 1; i < arr.length; i++)
			if (arr[i] > max)
				max = arr[i];

		return max;
	}

	// Driver method
	public static void main(String[] args) {
		System.out.println("Largest in given array is: " + largest());
	}
}
