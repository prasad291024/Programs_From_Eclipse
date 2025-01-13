package javaPackage;

public class Person1 {
    // Attributes (Fields)
    String name;
    int age;

    // Constructor
    Person1(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Method to display information
    void displayInfo() {
        System.out.println("Name: " + name + ", Age: " + age);
    }



    public static void main(String[] args) {
        // Create an object of the Person class
        Person1 p1 = new Person1("Alice", 25);

        // Access methods and attributes using the object
        p1.displayInfo(); // Output: Name: Alice, Age: 25
    }
}

