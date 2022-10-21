public class Person {

	String name;
	int age;

	// Constructor
	Person(String name, int age) {
		// Setting the name
		this.name = name;
		// Setting the age
		this.age = age;
	}

	// toString() method
	public String toString() {
		return "Name: " + this.name + "\nAge: " + this.age + "\n";
	}
}
