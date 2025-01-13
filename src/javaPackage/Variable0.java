package javaPackage;

import java.util.Scanner; // Import the Scanner class

public class Variable0 {

    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scan = new Scanner(System.in);
        
        // Prompt the user to enter a number
        System.out.println("Enter number to find out its square: ");
        
        // Read the integer input from the user
        int e = scan.nextInt();
        
        // Call the method to calculate the square
        int sq = printit(e);
        
        // Print the result
        System.out.println("Square: " + sq);
        
        // Close the scanner to avoid resource leak
        scan.close();
        
        int a = 5; // int type Local variable
        System.out.println(a);

        int b = 100; // int type local variable
        System.out.println(b);

        int c = 6;
        println(c); // Calls the method to print the square

    }

    private static int printit(int z) {
        // Calculate the square of the input
        int w = z * z;
        return w;
    }
    
    private static void println(int x) {
        int y = x * x;
        System.out.println("What is the square: " + y);
    }
}
