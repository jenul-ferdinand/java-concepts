public class Main {
	public static void main(String[] args) {

		// Overloaded Constructors = Multiple constructors with the same name, but different parameters
		// 							= Allows for more flexibility when creating objects
		// 							Name + Parameters = Signature

		// Create a new instance of the Pizza class
		Pizza hawaiian = new Pizza("Wheat", "Pizza Sauce", "Mozzarella", "Pineapple");
		Pizza original = new Pizza();

		// Output
		System.out.println("Here are the ingredients of your pizza: \n" + hawaiian);
		System.out.println();
		System.out.println("Here are the ingredients of your pizza: \n" + original);
	}
}
