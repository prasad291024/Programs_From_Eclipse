/*if (condition1) {
    if (condition2) {
        // Code if both conditions are true
    } else {
        // Code if condition1 is true and condition2 is false
    }
} else {
    // Code if condition1 is false
}
*/

//program - 
package javaPackage;

public class NestedIf {

	public static void main(String[] args) {
		int age = 19;
		boolean hasID = true;

		if (age >= 18) {
		    if (hasID) {
		        System.out.println("You are allowed to enter.");
		    } else {
		        System.out.println("You need an ID to enter.");
		    }
		} else {
		    System.out.println("You are not allowed to enter.");
		}


	}

}
