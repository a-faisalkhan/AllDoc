package com.bridgelabz.workshop1;

public class Hobbies {

	public static void main(String[] args) {

		System.out.print("My hobbies are ");
		String[] hobbies = new String[] { "Cycling", "Reading", "Music" };
		for (int i = 0; i < hobbies.length; i++) {
			System.out.print(hobbies[i]);
			if (i < hobbies.length - 1) {
				System.out.print(", ");
			}
		}
		
		System.out.print(".");
	}
}
