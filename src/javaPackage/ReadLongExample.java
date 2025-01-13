package javaPackage;

import java.util.Scanner;

public class ReadLongExample {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter Number : ");
		
		Long longint = scan.nextLong();
		
		System.out.println("Entered number : " + longint);
	}

}
