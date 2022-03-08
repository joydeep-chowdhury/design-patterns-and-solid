package behaviouraldesignpattern.visitor;

public class VisitorImpl implements Visitor {

	@Override
	public int visit(Pen pen) {
		int price = pen.getPrice();
		System.out.println(pen.getModel() + " costs " + price);
		return price;
	}

	@Override
	public int visit(Notebook notebook) {
		int price = 0;
		if (notebook.getNumberOfPages() > 250) {
			price = notebook.getPrice() - 5;
		} else {
			price = notebook.getPrice();
		}
		System.out.println("Notebook costs " + price);

		return price;
	}
}
