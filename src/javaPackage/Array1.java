package javaPackage;

public class Array1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int B = 34; // int type variable B assigned value as 34
        // Step 1: Declare and initialize an array
        int A[] = new int[5]; // int type Array named as A to hold 5 integers

        // Step 2: Assign values
        A[0] = 85;
        A[1] = 90;
        A[2] = 78;
        A[3] = 88;
        A[4] = 95;

        // Step 3: Access and display values
        System.out.println("Marks of the student:");
        for (int i = 0; i < A.length; i++) {
            System.out.println("Subject " + (i + 1) + ": " + A[i]);
        }
        
     // Step 4: Access Specific values
        System.out.println("Marks of the student in Subject 3 is "  + ":" + A[2]);
        
        
        boolean flag [] = new boolean[2];
        
        flag[0] = false;
        flag[1] = true; 
        
        System.out.println("Machine output is: " + flag[0]);
        
        
        
        
        int lc[] = {4,7,2,54,7,12,698};
        
        System.out.println("Length of above Array is: " + lc.length);
        
        System.out.print("Array values: ");
        
        for (int i = 0; i < lc.length; i++) {
        	
        	System.out.print(lc[i] + " " );
			
		}
    }
}
