The Composition Over Inheritance Principle
One should often prefer composition over inheritance when designing their systems. In Java, this means that we should more often define interfaces and implement them, rather than defining classes and extending them.

We've already mentioned the Car is a Vehicle as a common guiding principle people use to determine whether classes should inherit one another or not.

Despite being tricky to think about and tending to violate The Liskov Substitution Principle, this way of thinking is extremely problematic when it comes to reusing and repurposing code later in development.

The problem here is illustrated by the following example:

object relationship diagram

Spaceship and Airplane extend an abstract class FlyingVehicle, while Car and Truck extend GroundVehicle. Each have their respective methods which make sense for the type of vehicle, and we'd naturally group them together with abstraction when thinking of them in these terms.


This inheritance structure is based on thinking about objects in terms of what they are instead of what they do.

The problem with this is that new requirements can throw the whole hierarchy off balance. In this example, what if your boss waltzed in and informed you that a client wants a flying car now? If you inherit from FlyingVehicle, you'll have to implement drive() again even though that same functionality already exists, thereby violating the DRY Principle, and vice-versa:

public class FlyingVehicle {
    public void fly() {}
    public void land() {}
}

public class GroundVehicle {
    public void drive() {}
}

public class FlyingCar extends FlyingVehicle {

    @Override
    public void fly() {}

    @Override
    public void land() {}

    public void drive() {}
}

public class FlyingCar2 extends GroundVehicle {

    @Override
    public void drive() {}

    public void fly() {}
    public void land() {}
}
Since most languages, including Java, don't allow multiple inheritance, we can opt to extend either one of these classes. Though, in both cases, we can't inherit the functionality of the other and have to rewrite it.

You may figure out a way to change the whole architecture to fit around this new FlyingCar class, but depending on how deep in the development you are that can be a costly process.

Given this problem, we could try and avoid this whole mess by basing our generalities on common functionality instead of inherent similarity. This is the way a lot of built-in Java mechanisms have been developed.

If your class is going to implement all of the functionalities and your child class can be used as a substitute for your parent class, use inheritance.

If you class is going to implement some specific functionalities, use composition.

We use Runnable, Comparable, etc. instead of using some abstract classes implementing their methods because it's cleaner, it makes code more reusable, and it makes it easy to create a new class that conforms to what we need in order to use previously made functionalities.

This also resolves the problem of dependencies destroying important functionalities and causing a chain reaction throughout our code. Instead of having a big problem when we need to make our code work for a new type of thing, we can simply make that new thing conform to previously set standards and work just as well as the old thing.

In our vehicle example, we could just implement interfaces Flyable and Drivable instead of introducing abstraction and inheritance.

Our Airplane and Spaceship could implement Flyable, our Car and Truck could implement Drivable, and our new FlyingCar could implement both.

No changes in the class structure needed, no major DRY violations, no confusion of colleagues. If you happen to need exact same functionality in multiple classes, you can implement it using a default method in your interface, to avoid violating DRY.