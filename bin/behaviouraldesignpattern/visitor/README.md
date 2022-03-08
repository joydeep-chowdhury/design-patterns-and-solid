Visitor
The Visitor pattern is used to move the operational logic from each individual element of a group, into a new class, which does the operation for them utilizing the data from each individual element.


This is done by making all of the elements accept a "visitor". This visitor will perform changes in a separate class, without changing the structure of the visited class at all. This makes it easy to add new functionality without changing visited classes at all.

That being said, the objects don't have to be the same and can be unrelated, implementing different interfaces etc. An example would be an application that counts the number of users on a website. Some of these users are admins, some are customers, some are moderators etc.

Even though they can implement different interfaces and serve different functions, this pattern can help acquire the correct number of users.