package javaPackage;

//Define the Car class
class Car {
	// Attributes (Properties)
	String color;
	String model;
	int speed;
	

	// Method (Behavior)
	void start() {
		System.out.println("Car is starting...");
	}

	void stop() {
		System.out.println("Car is stopping...");
	}

	void accelerate(int increment) {
		speed += increment;
		System.out.println("Car is accelerating. New speed: " + speed);
	}

//Create Objects from the class 
	public static void main(String[] args) {
		// Create a new Car object
		Car myCar = new Car();

		// Set attributes
		myCar.color = "Red";
		myCar.model = "Tesla Model 3";
		myCar.speed = 18;
		

		// Use methods
		myCar.start();
		myCar.accelerate(43);
		myCar.stop();
	}
}
