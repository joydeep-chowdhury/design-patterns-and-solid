package behaviouraldesignpattern.chainofresponsibility;

public class Manager extends Employee {

	public Manager(int authorityLevel) {
		this.authorityLevel = authorityLevel;
	}

	@Override
	protected void write(String message) {
		System.out.println("Manager is working on project: " + message);
	}
}
