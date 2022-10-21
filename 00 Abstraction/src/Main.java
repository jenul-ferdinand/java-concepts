public class Main {
	public static void main(String[] args) {
		// abstract, abstract classes cannot be instantiated, but they can have a subclass
		// 			 abstract methods are declared without an implementation

		// Vehicle vehicle = new Vehicle(); // You cannot instantiate an abstract class

		Car car = new Car();
		car.move();

		// Abstract classes add a layer of security to your program. The user can no longer instantiate an instance of
		// the abstract class, but they can still instantiate a subclass of the abstract class.
	}
}