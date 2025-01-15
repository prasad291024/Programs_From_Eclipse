package javaPackage;

import java.util.Scanner;

public class NestedIfElse {

	public static void main(String[] args) {
		 int marksObtained, passingMarks = 40;
	        char grade;

	        Scanner input = new Scanner(System.in);

	        System.out.println("Input marks obtained:");
	        marksObtained = input.nextInt();

	        if (marksObtained >= passingMarks) {
	            if (marksObtained >= 90) {
	                grade = 'A';
	            } else if (marksObtained >= 75) {
	                grade = 'B';
	            } else if (marksObtained >= 60) {
	                grade = 'C';
	            } else {
	                grade = 'D';
	            }
	            System.out.println("You passed the exam. Grade obtained: " + grade);
	        } else {
	            grade = 'F';
	            System.out.println("You failed the exam. Grade obtained: " + grade);
	        }

	        input.close();

	}

}
