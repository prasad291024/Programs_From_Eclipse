package javaPackage;

public class Array0 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        // Step 1: Declare and initialize an array
        int[] marks = new int[5]; // Array to hold 5 integers

        // Step 2: Assign values
        marks[0] = 85;
        marks[1] = 90;
        marks[2] = 78;
        marks[3] = 88;
        marks[4] = 95;

        // Step 3: Access and display values
        System.out.println("Marks of the student:");
        for (int i = 0; i < marks.length; i++) {
            System.out.println("Subject " + (i + 1) + ": " + marks[i]);
        }
        
     // Step 4: Access Specific values
        System.out.println("Marks of the student in Subject 3 is "  + ":" + marks[2]);
    }
}
