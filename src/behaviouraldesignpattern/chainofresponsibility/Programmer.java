package behaviouraldesignpattern.chainofresponsibility;

public class Programmer extends Employee {

	public Programmer(int authorityLevel) {
		this.authorityLevel = authorityLevel;
	}

	@Override
	protected void write(String message) {
		System.out.println("Programmer is working on project: " + message);
	}
}
