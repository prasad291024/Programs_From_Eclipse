/* Syntax - 
if (condition1) {
    // Code if condition1 is true
} else if (condition2) {
    // Code if condition2 is true
} else {
    // Code if all conditions are false
}
*/

//program - 
package javaPackage;

public class If_else_if_else_Ladder {

	public static void main(String[] args) {
		int marks = 85;

		if (marks >= 90) {
		    System.out.println("Grade: A");
		} else if (marks >= 80) {
		    System.out.println("Grade: B");
		} else if (marks >= 70) {
		    System.out.println("Grade: C");
		} else {
		    System.out.println("Grade: D");
		}


	}

}
