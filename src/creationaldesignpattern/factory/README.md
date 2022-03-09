The Factory Method, also often called the Factory Pattern is a widely used design pattern that commands object creation.

In this pattern, a Factory class is created as the parent class of all sub-classes belonging to a certain logical segment of related classes.

Just like a SessionFactory is used to create, update, delete and manipulate all Session objects, so is any other factory responsible for their set of child classes.

It's important to note that the sub-classes can't be reached without using their respective factory. This way, their creation is both hidden from the client and is dependent on the factory.