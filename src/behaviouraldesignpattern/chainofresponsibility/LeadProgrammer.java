package behaviouraldesignpattern.chainofresponsibility;

public class LeadProgrammer extends Employee {

	public LeadProgrammer(int authorityLevel) {
		this.authorityLevel = authorityLevel;
	}

	@Override
	protected void write(String message) {
		System.out.println("Lead programmer is working on project: " + message);
	}
}
