The Builder pattern is used to help build final objects, for classes with a huge amount of fields or parameters in a step-by-step manner. It's not very useful in small, simple classes that don't have many fields, but complex objects are both hard to read and maintain by themselves.

Initializing an object with more than a few fields using a constructor is messy and susceptible to human error.