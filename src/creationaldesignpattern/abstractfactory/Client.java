package creationaldesignpattern.abstractfactory;

public class Client {
	public static void main(String[] args) {

		AbstractFactory humanFactory = FactoryProducer.getFactory("Human");
		AbstractFactory petFactory = FactoryProducer.getFactory("Pet");

		Human human = humanFactory.getHuman("Child");
		human.feedPet();

		Pet pet = petFactory.getPet("Dog");
		pet.eat();

		Human human2 = humanFactory.getHuman("Elder");
		human2.feedPet();

		Pet pet2 = petFactory.getPet("Rabbit");
		pet2.eat();
	}
}
