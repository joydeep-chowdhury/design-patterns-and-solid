package structuraldesignpattern.bridge;

public class Client {
	public static void main(String[] args) {
		Animal bigDog = new Dog(3, 500, "Meat", new BigDog());
		Animal smallDog = new Dog(2, 250, "Granules", new SmallDog());

		bigDog.feed();
		smallDog.feed();
	}
}
