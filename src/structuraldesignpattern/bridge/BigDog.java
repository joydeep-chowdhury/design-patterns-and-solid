package structuraldesignpattern.bridge;

public class BigDog implements FeedingAPI {
	@Override
	public void feed(int timesADay, int amount, String typeOfFood) {
		System.out.println("Feeding a big dog, " + timesADay + " times a day with " + amount + " g of " + typeOfFood);
	}
}
