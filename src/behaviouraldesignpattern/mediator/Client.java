package behaviouraldesignpattern.mediator;

public class Client {
	public static void main(String[] args) {
		User david = new User("David");
		User scott = new User("Scott");

		david.sendMessage("Hi Scott! How are you?");
		scott.sendMessage("I'm great! Thanks for asking. How are you?");
	}
}
