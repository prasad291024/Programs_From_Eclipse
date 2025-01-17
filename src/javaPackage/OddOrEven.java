package javaPackage;

import java.util.Scanner;

public class OddOrEven {

	public static void main(String[] args) {
		int x;
        System.out.println("Enter an integer");

        Scanner in = new Scanner(System.in);

        x = in.nextInt();

        if (x % 2 ==0)
        {
            System.out.println("Entered Number is Even");
        }

        else
        {
            System.out.println("Entered Number is Odd");
        }

	}

}
