package behaviouraldesignpattern.visitor;

public class Pen implements Item {
	private int price;
	private String model;

	public Pen(int price, String model) {
		this.price = price;
		this.model = model;
	}

	public int getPrice() {
		return price;
	}

	public String getModel() {
		return model;
	}

	@Override
	public int accept(Visitor visitor) {
		return visitor.visit(this);
	}
}