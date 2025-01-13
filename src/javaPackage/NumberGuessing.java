package javaPackage;

public class NumberGuessing {

	public static void main(String[] args) {
		int targetNumber = 7; // Target number we are checking against
		int userGuess = 7; // This can be input from a user in a real-world scenario

		if (userGuess == targetNumber) {
			System.out.println("Correct! You've guessed the number.");
		} else {
			System.out.println("Incorrect guess. Try again!");
		}
		
		System.out.println("--------------------For String------------------------");
		
		String name1 = new String("Alice");
		String name2 = new String("Alice");

		if (name1 == name2) {
		    System.out.println("The references are the same.");
		} else {
		    System.out.println("The references are different.");
		}

		if (name1.equals(name2)) {
		    System.out.println("The content is the same.");
		} else {
		    System.out.println("The content is different.");
		}

	}

}
