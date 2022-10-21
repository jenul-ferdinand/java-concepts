public class Main {
	public static void main(String[] args) {
		// Super, keyword refers to the superclass (parent) of an object.
		// It is used to call the constructor and methods of the superclass.

		// Create Object
		Hero flash = new Hero("The Flash", 25, "Super Speed");
		Hero martianManhunter = new Hero("Martian Manhunter", 225, "Shape Shifting");

		// Output
		System.out.println(flash);
		System.out.println(martianManhunter);
	}
}
