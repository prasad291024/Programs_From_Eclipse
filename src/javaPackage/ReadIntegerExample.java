package javaPackage;

import java.util.Scanner;

public class ReadIntegerExample {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter integer : - ");
		
		int num =  scan.nextInt();
		
		System.out.println("Entered number is :"+ num);

	}

}
