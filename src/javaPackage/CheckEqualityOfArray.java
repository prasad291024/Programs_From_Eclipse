package javaPackage;


public class CheckEqualityOfArray {

    public static void main(String[] args) {
        
        int arrayOne[] = {4, 6, 8, 1, 0, 7, 3, 0};
        int arrayTwo[] = {4, 6, 8, 1, 0, 7, 3, 0};
        
        // Check if lengths of the arrays are equal
        if (arrayOne.length != arrayTwo.length) {
            System.out.println("Arrays are not Equal");
            return; // Exit the program early if lengths are unequal
        }
        
        // Check if elements are equal
        boolean areEqual = true; // Assume arrays are equal
        for (int i = 0; i < arrayOne.length; i++) {
            if (arrayOne[i] != arrayTwo[i]) {
                areEqual = false; // Mark arrays as not equal
                break; // Exit the loop since arrays are not equal
            }
        }

        // Print the result based on the equality check
        if (areEqual) {
            System.out.println("Arrays are Equal");
        } else {
            System.out.println("Arrays are not Equal");
        }
    }
}
