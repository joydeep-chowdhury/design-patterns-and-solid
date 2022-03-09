package structuraldesignpattern.bridge;

public class Dog extends Animal {
	private int timesADay, amount;
	private String typeOfFood;

	public Dog(int timesADay, int amount, String typeOfFood, FeedingAPI feedingAPI) {
		super(feedingAPI);
		this.timesADay = timesADay;
		this.amount = amount;
		this.typeOfFood = typeOfFood;
	}

	public void feed() {
		feedingAPI.feed(timesADay, amount, typeOfFood);
	}
}
