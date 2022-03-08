package behaviouraldesignpattern.strategy;

public class Client {
	public static void main(String[] args) {
		BuildContext buildContext = new BuildContext(new Skyscraper());
		System.out.println("Requesting a skyscraper: " + buildContext.executeStrategy("Downtown"));

		buildContext = new BuildContext(new House());
		System.out.println("Requesting a house: " + buildContext.executeStrategy("Outskirts"));

		buildContext = new BuildContext(new Mall());
		System.out.println("Requesting a mall: " + buildContext.executeStrategy("City Centre"));
	}
}
