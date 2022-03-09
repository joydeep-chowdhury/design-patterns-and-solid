package structuraldesignpattern.bridge;

public abstract class Animal {
	protected FeedingAPI feedingAPI;

	protected Animal(FeedingAPI feedingAPI) {
		this.feedingAPI = feedingAPI;
	}

	public abstract void feed();
}
