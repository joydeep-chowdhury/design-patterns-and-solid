package behaviouraldesignpattern.command;

public class Client {

	public static void main(String[] args) {
		Application application = new Application();
		MakeApplication makeApplication = new MakeApplication(application);
		SellApplication sellApplication = new SellApplication(application);

		Programmer programmer = new Programmer();
		programmer.takeOrder(makeApplication);
		programmer.takeOrder(sellApplication);

		programmer.placeOrders();
	}

}
