public class Pizza {
	String bread;
	String sauce;
	String cheese;
	String topping;

	// Default Constructor
	Pizza() {
		this.bread = "White";
		this.sauce = "Tomato";
		this.cheese = "Mozzarella";
		this.topping = "Pepperoni";
	}

	// Full Constructor
	Pizza(String bread, String sauce, String cheese, String topping) {
		this.bread = bread;
		this.sauce = sauce;
		this.cheese = cheese;
		this.topping = topping;
	}

	// No 'topping' Constructor
	Pizza(String bread, String sauce, String cheese) {
		this.bread = bread;
		this.sauce = sauce;
		this.cheese = cheese;
	}

	public String toString() {
		return "Bread: " + bread + ",\nSauce: " + sauce + ",\nCheese: " + cheese + ",\nTopping: " + topping;
	}
}
