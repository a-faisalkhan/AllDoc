package com.bridgelabz.workshop1;

public class TestString {

	public static void main(String[] args) {

		String name = "Faisal";
		String name2 = "faisal";
		String city = "MUMBAI";
		String name3 = "123faisal";

		// int length = name.length();
		System.out.println("Name after concating: " + name.concat(" " + "Ahamad"));
		System.out.println("Chaech names are equal or not: " + name.equals(name2));
		System.out.println("Comparing names: " + name.compareTo(name));
		System.out.println("Name length is: " + name.length());
		System.out.println("Character at particular Index is: " + name.charAt(2));
		System.out.println("Checking if name contains char only: " + name.contains(name3));
		System.out.println("Converting name in Upper case: " + name2.toUpperCase());
		System.out.println("Converting city in lower case: " + city.toLowerCase());
		System.out.println("Checking if faisal is the suffix of name3: " + name3.endsWith(name2));

	}

}
