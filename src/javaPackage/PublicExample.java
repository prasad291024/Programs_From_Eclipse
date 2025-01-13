package javaPackage;

public class PublicExample {

	public String name = "Public Access"; // variables

    public void display() // attributes 
    
    {
        System.out.println("String Name in Method:" +name);
        
        int A = 67;
    }
    
    
    //execution 
    public static void main(String[] args) {
		
    	PublicExample example = new PublicExample();
    	example.display(); // Accessible everywhere
    	System.out.println("name - " +example.name);  
    	
	}
    
    
}
