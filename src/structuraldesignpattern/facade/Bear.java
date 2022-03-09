package structuraldesignpattern.facade;

public class Bear implements Animal {
	@Override
	public void feed() {
		System.out.println("The bear if being fed!");
	}
}