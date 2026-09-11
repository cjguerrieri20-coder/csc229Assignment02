package com.mycompany.csc229_211review_lab02hw;

import java.util.Scanner;

/**
 * Driver class to instantiate and test the Student class.
 *
 * @author Catherine Guerrieri
 */
public class DriverClass {

	public static void main(String[] args) {
		// ToDo 5 & ToDo 6: Cast 20 to short to match Student(String, short) constructor
		Student std1 = new Student("James", (short) 20);

		// ToDo 8: Prompt for GPA, assign it using the setter, and print the student
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter GPA for " + std1.getName() + ": ");
		double inputGpa = scanner.nextDouble();
		std1.setGpa(inputGpa);

		// Prints student details via the overridden toString() method in Student.java
		System.out.println(std1);

		scanner.close();

		// ToDo 9: Inline comments explain functionality; full breakdown provided in submission notes
		// ToDo 10: Commit, push, and submit via GitHub Pull Request
	}
}