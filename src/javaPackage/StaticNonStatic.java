package javaPackage;

public class StaticNonStatic {

	    // Static method
	    static void staticMethod() {
	        System.out.println("This is a static method.");
	    }

	    // Non-static method
	    void nonStaticMethod() {
	        System.out.println("This is a non-static method.");
	        staticMethod(); // Calling static method directly
	        StaticNonStatic.staticMethod(); // Calling static method using class name
	        System.out.println("------------------------------------");
	    }
	    
	

	    public static void main(String[] args) {
	    	// executing non static method using object
	    	StaticNonStatic sns = new StaticNonStatic();
	    	sns.nonStaticMethod(); 
	    	
	    	// executing static method 
	    	staticMethod();//directly 
	    	StaticNonStatic.staticMethod();//using class 
	    	sns.staticMethod();//using object 
	    }
	
}
	
	
	
	
	
	
	

