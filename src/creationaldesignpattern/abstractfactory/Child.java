package creationaldesignpattern.abstractfactory;

public class Child implements Human {
	@Override
	public void feedPet() {
		System.out.println("Child is feeding pet irresponsibly.");
	}
}
