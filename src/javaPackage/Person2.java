package javaPackage;

public class Person2 {
	// Attributes (Fields)
	String name;
	int age;

	// Method to display information
	void displayInfo() {
		System.out.println("Name: " + name + ", Age: " + age);
	}

	public static void main(String[] args) {
		// Create an object of the Person class
		Person2 p2 = new Person2(); // Object created without using a constructor

		// Set the attributes manually
		p2.name = "Alice";
		p2.age = 25;

		// Access methods and attributes using the object
		p2.displayInfo(); // Output: Name: Alice, Age: 25

		// Create another object
		Person2 p20 = new Person2();

		// Set attributes for the second object
		p20.name = "Bob";
		p20.age = 30;

		// Display information for the second object
		p20.displayInfo(); // Output: Name: Bob, Age: 30
	}
}
