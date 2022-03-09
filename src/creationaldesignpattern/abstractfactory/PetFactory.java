package creationaldesignpattern.abstractfactory;

public class PetFactory extends AbstractFactory {

	@Override
	public Pet getPet(String pet) {
		if (pet.equals(null))
			return null;

		if (pet.equalsIgnoreCase("Dog")) {
			return new Dog();
		} else if (pet.equalsIgnoreCase("Cat")) {
			return new Cat();
		} else if (pet.equalsIgnoreCase("Rabbit")) {
			return new Rabbit();
		}
		return null;
	}

	@Override
	public Human getHuman(String human) {
		// don't implement
		return null;
	}
}
