The Single Responsibility Principle (SRP)
The Single Responsibility Principle (SRP) states that there should never be two functionalities in one class. Sometimes, it's paraphrased as:

"A class should only have one, and only one, reason to be changed."

Where a "reason to be changed" is the responsibility of the class. If there is more than one responsibility, there are more reasons to change that class at some point.

This means that in the event of a functionality needing an update, there shouldn't be multiple separate functionalities in that same class that may be affected.

This principle makes it easier to deal with bugs, to implement changes without confusing co-dependencies, and to inherit from a class without having to implement or inherit methods your class doesn't need.

While it may seem that this encourages you to rely on dependencies a lot, this sort of modularity is much more important. Some level of dependency between classes is inevitable, which is why we also have principles and patterns to deal with that.

For an example, say our application should retrieve some product information from the database, then process it and finally display it to the end-user.

We could use a single class to handle the database call, process the information and push the information to the presentation layer. Though, bundling these functionalities makes our code unreadable and illogical.

What we'd do instead is defining a class, such as ProductService that would fetch the product from the database, a ProductController to process the info and then we'd display it in a presentation layer - either an HTML page or another class/GUI.