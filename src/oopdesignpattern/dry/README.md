Don't Repeat Yourself (DRY) Principle
The Don't Repeat Yourself (DRY) principle is a common principle across programming paradigms, but it is especially important in OOP. According to the principle:

Every piece of knowledge or logic must have a single, unambiguous representation within a system.

When it comes to OOP, this means utilizing abstract classes, interfaces, and public constants. Whenever there's a functionality common across classes, it either might make sense to abstract them away into a common parent class or use interfaces to couple their functionality:


public class Animal {
    public void eatFood() {
        System.out.println("Eating food...");
    }
}

public class Cat extends Animal {
    public void meow() {
        System.out.println("Meow! *purrs*");
    }
}

public class Dog extends Animal {
    public void woof() {
        System.out.println("Woof! *wags tail*");
    }
}


Cat cat = new Cat();
cat.eatFood();
cat.meow();

Dog dog = new Dog();
dog.eatFood();
dog.woof();


Whenever there's a constant that's used multiple times, it's good practice to define it as a public constant:

static final int GENERATION_SIZE = 5000;
static final int REPRODUCTION_SIZE = 200;
static final int MAX_ITERATIONS = 1000;
static final float MUTATION_SIZE = 0.1f;
static final int TOURNAMENT_SIZE = 40;
For an example, we'll be using these constants several times, and eventually we'll be changing their values manually to optimize a genetic algorithm. It would be easy to make a mistake if we had to update each of these values at multiple places.

Also, we don't want to make a mistake and programmatically change these values during execution, so we're also introducing the final modifier.

Note: Due to the naming convention in Java, these should be capitalized with words separated by an underscore ("_").

The purpose of this principle is to ensure easy maintenance of code, because when a functionality or a constant changes you have to edit the code only in one place. This not only makes the job easier, but ensures that mistakes won't happen in the future. You may forget to edit the code in multiple places, or somebody else who's not as familiar with your project may not know that you've repeated code and may end up editing it in just one place.

However, it's important to apply common sense when using this principle. If you use the same piece of code to do two different things initially, that doesn't mean those two things will always need to be dealt with in the same way.

This usually happens if structures are actually dissimilar, despite the same code being used to handle them. The code can also be 'over-dried', making it essentially unreadable because methods are called form unrelated, incomprehensible places.

A good architecture can amortize this, but the problem can crop up in practice nonetheless.