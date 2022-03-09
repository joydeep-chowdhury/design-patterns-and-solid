package creationaldesignpattern.prototype;

public class Programmer extends Employee {
	public Programmer() {
		position = "Senior";
	}

	@Override
	void work() {
		System.out.println("Writing code!");
	}
}
