package behaviouraldesignpattern.chainofresponsibility;

public abstract class Employee {
	public static int PROGRAMER = 1;
	public static int LEAD_PROGRAMER = 2;
	public static int MANAGER = 3;

	protected int authorityLevel;
	protected Employee nextEmployee;

	public void setNextEmployee(Employee employee) {
		this.nextEmployee = employee;
	}

	abstract protected void write(String message);

	public void doWork(int authorityLevel, String message) {
		if (this.authorityLevel <= authorityLevel) {
			write(message);
		}
		if (nextEmployee != null) {
			nextEmployee.doWork(authorityLevel, message);
		}
	}
}
