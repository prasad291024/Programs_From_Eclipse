package javaPackage;

import java.util.Scanner;

public class NumberGuessing2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		// Get target number and user's guess from the user
		System.out.print("Enter the target number: ");
		int targetNumber = scan.nextInt();

		System.out.print("Enter your guess: ");
		int userGuess = scan.nextInt();

		// Check if the user's guess is correct
		if (userGuess == targetNumber) {
			System.out.println("Correct! You've guessed the number.");
		} else {
			System.out.println("Incorrect guess. Try again!");
		}

		System.out.println("--------------------For String------------------------");

		// Get two strings from the user
		scan.nextLine(); // Clear the newline left by nextInt()

		System.out.print("Enter the first name: ");
		String name1 = scan.nextLine();

		System.out.print("Enter the second name: ");
		String name2 = scan.nextLine();

		// Compare the references of the two strings
		if (name1 == name2) {
			System.out.println("The references are the same.");
		} else {
			System.out.println("The references are different.");
		}

		// Compare the content of the two strings
		if (name1.equals(name2)) {
			System.out.println("The content is the same.");
		} else {
			System.out.println("The content is different.");
		}

		// Close the scanner to free up resources
		scan.close();
	}
}
