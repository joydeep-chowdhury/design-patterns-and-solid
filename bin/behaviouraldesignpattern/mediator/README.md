Mediator
Similar to the Adapter pattern, but with a different goal. The Mediator pattern acts as a bridge and, as the name implies, the mediator between different objects which communicate in any way. In large-scale applications, direct communication means tight-coupling which makes it hard to test, maintain and scale.

The Mediator pattern addresses this issue by acting as a third party over which the communication is done, decoupling them in the process.