package javaPackage;

import java.util.Iterator;

public class FirstJavaProgram {

	static String i = "Shamu";

	// main method - predefined
	public static void main(String[] args) {
		System.out.println("Shammy");

		System.out.println("Shammy2");

	
		System.out.println("i is equal :" + i);

		System.out.print("loop of i :");
		for (int i = 0; i < 5; i++) {

			System.out.print("  " + i);
			
		}
		
		System.out.println("--------------------------------------------------  ");
		bMethod();
		aMethod();


	}

	// method creation - user defined
	public static void aMethod() {
		System.out.println("Hello in a method");
	}

	public static void bMethod() {

		System.out.println("hello in b method");
	}


}
