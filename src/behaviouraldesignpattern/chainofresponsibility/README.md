Chain of Responsibility
The Chain of Responsibility pattern is widely used and adopted. It defines a chain of objects, that collectively, one after another, process the request - where each processor in the chain has its own processing logic.

Each of these processing units decides who should continue processing the request next, and each has a reference to the next in line.

It's important to note that it's very handy for decoupling the sender from the receiver.