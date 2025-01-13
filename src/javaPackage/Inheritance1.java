package javaPackage;

public class Inheritance1 {

    int roll = 5;   // Instance variable

    int srno = 5;   // Class-level variable (not inside the main method)

    public static void main(String[] args) {
        // You don't need to define srno again here, it's already defined as an instance variable

        Inheritance1 i1 = new Inheritance1();
        System.out.println("Roll number is : " + i1.roll);
        System.out.println("Serial number is : " + i1.srno);
    }

}
// end of program 1
