package javaPackage;

import java.util.Scanner;

public class IfElse1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int marksObtained, passingMarks;

		passingMarks = 40;

		Scanner input = new Scanner(System.in);

		System.out.println("Input Marks Scored by You: ");

		marksObtained = input.nextInt();

		if (marksObtained >= passingMarks) {
			System.out.println("You passed the Exam");
		}

		else {
			System.out.println("You Failed the Exam");
		}

	}

}
