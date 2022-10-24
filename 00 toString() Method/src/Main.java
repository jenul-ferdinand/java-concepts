public class Main {
	public static void main(String[] args) {

		// toString() = special method that all objects inherit,
		// 				that return a string that "textually represents" an object
		//				can be used both implicitly and explicitly

		// Create instance of 'Car' class
		Car ferrari = new Car("Ferrari", "F8", 340);

		// Output
		System.out.println(ferrari); // Implicit
		// System.out.println(ferrari.toString()); // You do not have to do this Explicitly, since it is called Implicitly
	}
}
