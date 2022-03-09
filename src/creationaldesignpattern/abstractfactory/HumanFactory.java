package creationaldesignpattern.abstractfactory;

public class HumanFactory extends AbstractFactory {

	@Override
	public Human getHuman(String human) {
		if (human.equals(null))
			return null;

		if (human.equalsIgnoreCase("chILd")) {
			return new Child();
		} else if (human.equalsIgnoreCase("adult")) {
			return new Adult();
		} else if (human.equalsIgnoreCase("elDeR")) {
			return new Elder();
		}
		return null;
	}

	@Override
	public Pet getPet(String pet) {
		// don't implement
		return null;
	}
}
