package structuraldesignpattern.adapter;

public class SkyscrapperBuilder implements AdvancedBuilder {
	@Override
	public void buildSkyscrapper(String location) {
		System.out.println("Building a skyscrapper in the " + location + "area!");
	}

	@Override
	public void buildHouse(String location) {
		// don't implement
	}
}
