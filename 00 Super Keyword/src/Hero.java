public class Hero extends Person {

	String power;

	// Constructor
	Hero(String name, int age, String power) {
		// Calling the constructor of the superclass (Person)
		super(name, age);

		// Setting the power
		this.power = power;
	}

	// toString() method
	public String toString() {
		// We can use the super keyword to call the toString method of the superclass.
		return super.toString() + "Power: " + this.power + "\n";
	}
}
