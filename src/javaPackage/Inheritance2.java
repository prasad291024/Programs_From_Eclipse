package javaPackage;

public class Inheritance2 extends Inheritance1 {
    
    String name = "Ed";   // Instance variable

    public static void main(String[] args) {
        
        Inheritance2 i2 = new Inheritance2();

        System.out.println("Name is : " + i2.name);

        // Now i2 can access srno because it's a class-level variable in Inheritance1
        System.out.println("Roll number is : " + i2.roll);
        System.out.println("Serial number is : " + i2.srno);   // This will work now!
    }

}
// end of program 2
