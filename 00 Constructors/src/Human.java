public class Human {
	String name;
	int age;
	double weight;

	Human(String name, int age, double weight) {
		this.name = name;
		this.age = age;
		this.weight = weight;
	}

	public String toString() {
		return "Name: " + name + "\n" +
				"Age: " + age + "\n" +
				"Weight: " + weight + "\n";
	}
}
