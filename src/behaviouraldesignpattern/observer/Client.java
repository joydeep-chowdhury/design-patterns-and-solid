package behaviouraldesignpattern.observer;

public class Client {
	public static void main(String[] args) {
		Programmer programmer = new Programmer();

		new CEO(programmer);
		new Manager(programmer);
		new LeadProgrammer(programmer);

		System.out.println("Programmer successfully did his job!");
		programmer.setState("Successful");
		System.out.println("Programmer failed his new assignment.");
		programmer.setState("Failed");
	}
}
