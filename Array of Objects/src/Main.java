import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		// int refrigeratorCapacity = 3;
		// Food[] refrigerator = new Food[refrigeratorCapacity]; // The refrigerator can hold 3 food items

		Food food1 = new Food("Oranges");
		Food food2 = new Food("Noodles");
		Food food3 = new Food("Pizza");

		// Assign the values
		// refrigerator[0] = food1;
		// refrigerator[1] = food2;
		// refrigerator[2] = food3;

		// Create and assign the refrigerator array with the objects
		Food[] refrigerator = {food1, food2, food3};

		// Output
		System.out.println("Contents of Refrigerator: " + refrigerator[0].name + ", "
				+ refrigerator[1].name + ", "
				+ refrigerator[2].name);
	}
}