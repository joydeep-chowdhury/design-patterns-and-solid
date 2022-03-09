package structuraldesignpattern.filter;

public class Employee {
	private String name;
	private String gender;
	private String position;

	public Employee(String name, String gender, String position) {
		this.name = name;
		this.gender = gender;
		this.position = position;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

}