package behaviouraldesignpattern.command;

public class SellApplication implements Order {
	private Application application;

	public SellApplication(Application application) {
		this.application = application;
	}

	@Override
	public void placeOrder() {
		application.sell();
	}
}
