package structuraldesignpattern.facade;

public class Wolf implements Animal {
	@Override
	public void feed() {
		System.out.println("The wolf is being fed!");
	}
}
