The Dependency Inversion Principle (DIP)
According to the Dependency Inversion Principle (DIP), high-level and low-level modules should be decoupled in such a way that changing (or even replacing) low-level modules doesn't require (much) rework of high-level modules. Given that, both low-level and high-level modules shouldn't depend on each other, but rather they should depend on abstractions, such as interfaces.

Another important thing DIP states is:

Abstractions should not depend on details. Details (concrete implementations) should depend on abstractions.

This principle is important because it decouples modules, making the system less complex, easier to maintain and update, easier to test, and more reusable. I can't stress enough how much of a game changer this is, especially for unit testing and reusability. If the code is written generically enough, it can easily find application in another project, while code that's too specific and interdependent with other modules of the original project will be hard to decouple from it.

This principle is closely related to the dependency injection, which is practically the implementation or rather, the goal of DIP. DI boils down to - if two classes are dependent, their features should be abstracted away and they should both depend on the abstraction, instead of on each other. This essentially should allow us to change details of the implementation while retaining its functionality.

The Dependency Inversion Principle and Inversion of Control (IoC) are used interchangeably by some people, although it is not technically true.

Dependency Inversion guides us towards decoupling by using dependency injection through an Inversion of Control Container. Another name of IoC Containers could very well be Dependency Injection Containers, though the old name sticks around.