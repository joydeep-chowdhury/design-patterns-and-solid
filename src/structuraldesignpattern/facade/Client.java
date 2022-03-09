package structuraldesignpattern.facade;

public class Client {
	public static void main(String[] args) {
		ZooKeeper zookeeper = new ZooKeeper();

		zookeeper.feedLion();
		zookeeper.feedWolf();
		zookeeper.feedBear();
	}
}
