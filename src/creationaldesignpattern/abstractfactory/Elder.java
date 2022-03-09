package creationaldesignpattern.abstractfactory;

public class Elder implements Human {
	@Override
	public void feedPet() {
		System.out.println("Elder is overfeeding the pet.");
	}
}
