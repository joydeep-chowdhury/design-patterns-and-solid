package creationaldesignpattern.abstractfactory;

public class Rabbit implements Pet {
	@Override
	public void eat() {
		System.out.println("Rabbit is eating, squeak!");
	}
}
