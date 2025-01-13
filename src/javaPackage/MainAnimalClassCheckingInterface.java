package javaPackage;

public class MainAnimalClassCheckingInterface {

    public static void main(String[] args) {
        // Create Dog and Cat objects using Animal interface reference
        Animal myDog = new Dog();
        Animal myCat = new Cat();
        
        // Call methods on both
        myDog.sound();  // Output: Dog barks
        myDog.sleep();  // Output: Dog sleeps

        myCat.sound();  // Output: Cat meows
        myCat.sleep();  // Output: Cat sleeps
    }
}
