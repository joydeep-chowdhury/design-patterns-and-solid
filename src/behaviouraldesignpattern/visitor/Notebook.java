package behaviouraldesignpattern.visitor;

public class Notebook implements Item {
    private int price;
    private int numberOfPages;
    
    public Notebook(int price, int numberOfPages) {
        this.price = price;
        this.numberOfPages = numberOfPages;
    }
    
    public int getPrice() {
        return price;
    }
    
    public int getNumberOfPages() {
        return numberOfPages;
    }

    @Override
    public int accept(Visitor visitor) {
        return visitor.visit(this);
    }
}