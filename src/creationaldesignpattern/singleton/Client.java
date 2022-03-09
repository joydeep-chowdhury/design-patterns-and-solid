package creationaldesignpattern.singleton;

public class Client {
	public static void main(String[] args) {
		SingletonClass singletonClass = SingletonClass.getInstance();
		singletonClass.showMessage();
	}
}
