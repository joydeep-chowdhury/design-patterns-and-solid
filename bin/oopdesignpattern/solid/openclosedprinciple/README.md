The Open/Closed Principle
The Open/Closed principle states that classes or objects and methods should be open for extension, but closed for modifications.

What this means in essence is that you should design your classes and modules with possible future updates in mind, so they should have a generic design that you won't need to change the class itself in order to extend their behavior.

You can add more fields or methods, but in such a way that you don't need to rewrite old methods, delete old fields and modify the old code in order to make it work again. Thinking ahead will help you write stable code, before and after an update of requirements.

This principle is important in order to ensure backwards compatibility and prevent regressions - a bug which happens when your programs features or efficiency breaks after an update.