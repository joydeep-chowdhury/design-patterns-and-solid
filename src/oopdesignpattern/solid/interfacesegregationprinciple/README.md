The Interface Segregation Principle (ISP)
The Interface Segregation Principle (ISP) states that the client should never be forced to depend on an interface they aren't using in its entirety. This means that an interface should have a minimum set of methods necessary for the functionality it ensures, and should be limited to only one functionality.

For example, a Pizza interface shouldn't be required to implement an addPepperoni() method, because this doesn't have to be available for every type of pizza. For the sake of this tutorial, let's assume that all pizzas have a sauce and need to be baked and there's not a single exception.

This is when we can define an interface:


public interface Pizza {
    void addSauce();
    void bake();
}
And then, let's implement this through a couple of classes:

public class VegetarianPizza implements Pizza {
    public void addMushrooms() {System.out.println("Adding mushrooms");}

    @Override
    public void addSauce() {System.out.println("Adding sauce");}

    @Override
    public void bake() {System.out.println("Baking the vegetarian pizza");}
}

public class PepperoniPizza implements Pizza {
    public void addPepperoni() {System.out.println("Adding pepperoni");}

    @Override
    public void addSauce() {System.out.println("Adding sauce");}

    @Override
    public void bake() {System.out.println("Baking the pepperoni pizza");}
}
The VegetarianPizza has mushrooms whereas the PepperoniPizza has pepperoni. Both, of course, need sauce and need to be baked, which is also defined in the interface.

If the addMushrooms() or addPepperoni() methods were located in the interface, both classes would have to implement them even though they don't need both, but rather only one each.

We should strip interfaces of all but absolutely necessary functionalities.