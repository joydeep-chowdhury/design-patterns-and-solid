package structuraldesignpattern.facade;

public class ZooKeeper {
	private Animal lion;
	private Animal wolf;
	private Animal bear;

	public ZooKeeper() {
		lion = new Lion();
		wolf = new Wolf();
		bear = new Bear();
	}

	public void feedLion() {
		lion.feed();
	}

	public void feedWolf() {
		wolf.feed();
	}

	public void feedBear() {
		bear.feed();
	}
}
