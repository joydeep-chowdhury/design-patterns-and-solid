package creationaldesignpattern.abstractfactory;

public class Dog implements Pet {
	@Override
	public void eat() {
		System.out.println("Dog is eating, woof!");
	}
}
