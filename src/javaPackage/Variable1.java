package javaPackage;

public class Variable1 {

    public static void main(String[] args) {
        int a = 5; // int type Local variable
        System.out.println(a); // 5 

        int x = 100; // int type local variable
        System.out.println(x); // 100 

        x = 200; // update existing value stored in variable x. 
        System.out.println(x); // 200
        
        char c = 'a'; // char type local variable c , should be placed in single quote 
        System.out.println(c); // a 
        
        
        boolean b = true; //boolean type local variable b.
        System.out.println(b); // true 
        
        b = false; // update existing value of variable b.  
        System.out.println(b); // false 
        
        //conditional statement 
        System.out.println(3 > 12); // false 

        // for boolean datatype, output returns as true/false 
        
        int e = 100; 
        int f = 200; 
        
        boolean z = e > f;
        System.out.println(z); // false 
        
        
        boolean y = e < f;
        System.out.println(y); // true 
    }

   

   
}

