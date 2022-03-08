package behaviouraldesignpattern.command;

public class Application {
	private String name = "Computer Application";
	private int quantity = 2;

	public void make() {
		System.out.println(quantity + " application(s) are made for the client.");
	}

	public void sell() {
		System.out.println(quantity + "application(s) are sold to the client.");
	}
}
