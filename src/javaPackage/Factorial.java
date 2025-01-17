package javaPackage;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		int n, c, fact = 1;

        System.out.println("Enter integer to calculate it's factorial: ");

        Scanner scan = new Scanner(System.in);

        n = scan.nextInt();

        if (n < 0)
        {
            System.out.println("Integer should be non negative");
        }
        else
        {
            for ( c = 1; c <= n; c++ )
            fact = fact * c;

            System.out.println("Factorial of number " +n+ " is: " +fact);
        }
        
        scan.close();

	}

}
