package structuraldesignpattern.flyweight;

public class AttendeeImpl implements Attendee {
	private String name;
	private int age;

	public AttendeeImpl(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public void listenToConcert() {
		System.out.println(name + " is listening to concert " + age + " years old!");
	}
}
