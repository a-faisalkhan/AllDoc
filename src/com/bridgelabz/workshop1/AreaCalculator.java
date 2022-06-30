package com.bridgelabz.workshop1;

import java.util.Scanner;

public class AreaCalculator {

	double circleArea() {

		int radius;
		double pi = 3.14;
		double area;

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Radius: ");
		radius = scanner.nextInt();
		area = pi * radius * radius;
		System.out.println("Area of Circle: " + area);

		return area;
	}

	public static void main(String[] args) {
		AreaCalculator areaCalculator = new AreaCalculator();
		areaCalculator.circleArea();
		
//		System.out.println("Append list is: ");
//		LinkedList.add(56);
//		LinkedList.add(30);
//		LinkedList.add(70);
//		LinkedList.print();
//		
//		int deletedData = LinkedList.pop();
//		System.out.println();
//		System.out.println("popped head element is: " + deletedData);
//		LinkedList.print();

	}

}
