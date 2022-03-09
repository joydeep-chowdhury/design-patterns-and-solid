package creationaldesignpattern.singleton;

public class SingletonClass {

	private static SingletonClass instance = new SingletonClass();

	private SingletonClass() {
	}

	public static SingletonClass getInstance() {
		return instance;
	}

	public void showMessage() {
		System.out.println("I'm a singleton object!");
	}
}
