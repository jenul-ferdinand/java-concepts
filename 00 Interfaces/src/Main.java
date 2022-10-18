public class Main {
	public static void main(String[] args) {
		// Interface, A template that can be applied to a class.
		// 				Similar to inheritance, but specifies what a class has/must do.
		//				Classes can apply more than one interface, inheritance is limited to 1 superclass.

		// Create instances of the animals
		Eagle eagle = new Eagle();
		Jaguar jaguar = new Jaguar();
		Goldfish goldfish = new Goldfish();
		Rabbit rabbit = new Rabbit();

		// Output
		eagle.hunt();
		jaguar.hunt();
		goldfish.flee();
		rabbit.flee();
	}
}
