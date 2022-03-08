package behaviouraldesignpattern.visitor;

public interface Item {
    public int accept(Visitor visitor);
}
