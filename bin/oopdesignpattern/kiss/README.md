Keep It Simple and Stupid (KISS) Principle
The Keep it Simple and Stupid (KISS) principle is a reminder to keep your code simple and readable for humans. If your method handles multiple use-cases, split them into smaller functions. If it performs multiple functionalities, make multiple methods instead.

The core of this principle is that for most cases, unless efficiency is extremely crucial, another stack call isn't going to severely affect the performance of your program. In fact, some compilers or runtime environments will even simplify a method call into an inline execution.


On the other hand, unreadable and long methods will be very hard to maintain for human programmers, bugs will be harder to find, and you might find yourself violating DRY as well because if a function does two things, you can't call it to do just one of them, so you'll make another method.

All in all, if you find yourself tangled up in your own code and unsure what each part does, it's time for reevaluation.

It's almost certain that the design could be tweaked to make it more readable. And if you are having trouble as the one who designed it while it's all still fresh in your mind, think about how somebody who sees it for the first time in the future will perform.