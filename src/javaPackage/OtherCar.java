package javaPackage;

public class OtherCar {// Attributes (Properties)
	String color;
	String model;
	int speed;
	int increment;

	// Method (Behavior)
	void start() {
		System.out.println("Other Car is starting...");
	}

	void stop() {
		System.out.println("Other Car is stopping...");
	}

	void accelerate() {
		speed += increment;
		System.out.println("other Car is accelerating. New speed: " + speed);
	}

//Create Objects from the class 
	public static void main(String[] args) {
		// Create a new Car object
		OtherCar Car = new OtherCar();

		// Set attributes
		Car.color = "Red";
		Car.model = "Tesla Model 3";
		Car.speed = 10;
		

		// Use methods
		Car.start();
		Car.accelerate();
		Car.stop();
	}

}
