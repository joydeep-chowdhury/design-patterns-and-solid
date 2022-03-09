Liskov Substitution Principle (LSP)
According to the Liskov Substitution Principle (LSP), derived classes should be able to substitute their base classes without the behavior of your code changing.

This principle is closely related to The Interface Segregation Principle and The Single Responsibility Principle, meaning that a violation of either of those is likely to be (or become) a violation of LSP as well. This is because if a class does more than one thing, subclasses extending it are less likely to meaningfully implement those two or more functionalities.

A common way people think about object relationships (which can be a bit misleading at times) is that there needs to be an is relationship between classes.

For example:


Free eBook: Git Essentials
Check out our hands-on, practical guide to learning Git, with best-practices, industry-accepted standards, and included cheat sheet. Stop Googling Git commands and actually learn it!


Download the eBook  
Car is a Vehicle
TeachingAssistaint is a CollegeEmployee
It's important to note that these relationships don't go in both directions. The fact that Car is a Vehicle might not mean that Vehicle is a Car - it can be a Motorcycle, Bicycle, Truck...

The reason this can be misleading is a common mistake people make when thinking about it in natural language. For example, if I asked you if Square has an "is relationship" with Rectangle, you might automatically say yes.

After all, we know from geometry that a square is a special case of rectangle. But depending on how your structures are implemented, this might not be the case:

public class Rectangle {
    protected double a;
    protected double b;

    public Rectangle(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public void setA(double a) {
        this.a = a;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double calculateArea() {
        return a*b;
    }
}
Now let's try inheriting from it for our Square within the same package:

public class Square extends Rectangle {
    public Square(double a) {
        super(a, a);
    }

    @Override
    public void setA(double a) {
        this.a = a;
        this.b = a;
    }

    @Override
    public void setB(double b) {
        this.a = b;
        this.b = b;
    }
}
You'll notice that setters here actually set both a and b. Some of you may already guess the problem. Let's say we initialized our Square and applied polymorphism to contain it within a Rectangle variable:

Rectangle rec = new Square(5);
And let's say that sometime later in the program, maybe in an entirely separate function, another programmer who had nothing to do with implementing these classes, decides that they want to resize their rectangle. They may try something like this:

rec.setA(6);
rec.setB(3);
They'll get completely unexpected behavior and it might be difficult to trace back what the problem is.

If they try to use rec.calculateArea() the result won't be 18 as they might expect from a rectangle with sides of lengths 6 and 3.

The result would instead be 9 because their rectangle is actually a square and has two equal sides - of length 3.

You may say that this is exactly the behavior you wanted because that's how a square works, but it's nonetheless not the expected behavior from a rectangle.

So when we're inheriting we have to keep in mind the behavior of our classes and are they really functionally interchangeable within the code, rather than just the concepts being similar outside of the context of their usage in the program.