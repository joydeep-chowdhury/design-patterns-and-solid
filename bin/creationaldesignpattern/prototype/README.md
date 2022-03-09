Prototype
The Prototype pattern is used mainly to minimize the cost of object creation, usually when large-scale applications create, update or retrieve objects which cost a lot of resources.

This is done by copying the object, once it's created, and reusing the copy of the object in later requests, to avoid performing another resource-heavy operation. It depends on the decision of the developer whether this will be a full or shallow copy of the object, though the goal is the same.