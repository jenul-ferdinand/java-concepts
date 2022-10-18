public interface Predator {

	// The 'default' modifier allows the method to have a body.
	default void hunt() {
		System.out.println("The predator has hunted");
	}
}
