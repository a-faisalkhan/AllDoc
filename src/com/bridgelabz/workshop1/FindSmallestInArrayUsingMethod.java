package com.bridgelabz.workshop1;

public class FindSmallestInArrayUsingMethod {
	
	static int arr[] = {-3, -15, 5, 78, 95};

	// Method to find maximum in arr[]
	static int smallest() {

		// Initialize maximum element
		int min = arr[0];

		// Traverse array elements from second and
		// compare every element with current max
		for (int i = 1; i < arr.length; i++)
			if (arr[i] < min)
				min = arr[i];

		return min;
	}

	// Driver method
	public static void main(String[] args) {
		System.out.println("Largest in given array is: " + smallest());
	}

}
