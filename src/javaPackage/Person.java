package javaPackage;

public class Person {

    // Attributes
    String name;   // default value is null
    int age;       // default value is 0
    String gender = "Male"; // Initialized to "Male"

    // A method to display person's information
    void displayInfo() {
        System.out.println("Name: " + name + ", Age: " + age + ", Gender: " + gender);
    }

    public static void main(String[] args) {
        Person person1 = new Person();

        // Display the default values of the object
        person1.displayInfo(); // Output: Name: null, Age: 0, Gender: Male

        // Set values to the attributes
        person1.name = "Alice";
        person1.age = 30;

        // Display the updated information
        person1.displayInfo(); // Output: Name: Alice, Age: 30, Gender: Male
        
        // Correctly access and print the gender
        System.out.println("Gender: " + person1.gender); // Output: Gender: Male

        // Change the gender
        person1.gender = "Female"; // Assigning a new value to gender
        System.out.println("Updated Gender: " + person1.gender); // Output: Updated Gender: Female
    }
}
