package javaPackage;

import java.util.Scanner;

public class CompareStrings {

	public static void main(String[] args) {

		String s1, s2;
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter the First String");
		s1 = scan.nextLine();

		System.out.println("Enter the Second String");
		s2 = scan.nextLine();

		if (s1.compareTo(s2) > 0)
			System.out.println("First string is greater than second");

		else if (s1.compareTo(s2) < 0)
			System.out.println("First string is smaller than second");
		else

			System.out.println("Both strings are equal");

	}

}
