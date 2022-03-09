package creationaldesignpattern.abstractfactory;

public class FactoryProducer {
	public static AbstractFactory getFactory(String factory) {
		if (factory.equalsIgnoreCase("Human")) {
			return new HumanFactory();
		} else if (factory.equalsIgnoreCase("Pet")) {
			return new PetFactory();
		}
		return null;
	}
}
