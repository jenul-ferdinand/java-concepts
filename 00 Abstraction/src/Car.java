public class Car extends Vehicle {
	// The Car must move() because it is a child of Vehicle
	@Override
	void move() {
		System.out.println("The Car is moving");
	}
}

