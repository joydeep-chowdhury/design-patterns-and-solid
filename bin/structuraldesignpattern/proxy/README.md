Proxy
The Proxy pattern is used when we want to limit the capabilities and the functionalities of a class, by using another class which limits it.

By using this proxy class, the client uses the interface it defines, to access the original class. This ensures that the client can't do anything out of order with the original class since all of his requests pass through our proxy class.