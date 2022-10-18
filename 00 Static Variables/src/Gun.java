public class Gun {

	// Initialise the variables
	String name;					// Name of the gun
	static int guns = 0;			// The amount of guns

	// Gun constructor
	Gun(String name) {
		// Set the name of the gun
		this.name = name;

		// Increment the amount of guns
		guns++;
	}
}
