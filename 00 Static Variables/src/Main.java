public class Main {
	public static void main(String[] args) {
		// Static modifier, A single copy of a variable/method is created and shared.
		// i.e. The class "owns" the static member

		// Create the gun objects
		Gun ak47 = new Gun("AK-47");
		Gun usps = new Gun("USP-S");
		Gun m4a1 = new Gun("M4A1");

		// Print out the amount of guns
		System.out.println("Gun Amount: " + Gun.guns);
	}
}
