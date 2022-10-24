public class Car {
	String make, model;
	int topSpeed;

	Car(String make, String model, int topSpeed) {
		this.make = make;
		this.model = model;
		this.topSpeed = topSpeed;
	}

	public String toString() {
		return "Make: " + make + "\nModel: " + model + " \nTop Speed: " + topSpeed;
	}
}
