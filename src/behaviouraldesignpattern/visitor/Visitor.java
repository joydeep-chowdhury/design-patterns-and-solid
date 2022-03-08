package behaviouraldesignpattern.visitor;

public interface Visitor {
	int visit(Pen pen);

	int visit(Notebook notebook);
}
