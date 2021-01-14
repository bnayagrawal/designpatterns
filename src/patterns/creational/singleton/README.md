### Singleton
Ensure a class only has one instance, and provide a global point of access to it.

### Applicability
Use Singleton pattern when
* there must be only one instance of a class, and it must be accessible to clients
from a well-known access point.
* when the sole instance should be extensible by subclassing, and clients should be
able to use an extended instance without modifying their code.

### Participants
* defines an operation that lets clients access its unique instance. This operation is static.
* may be responsible for creating its own unique instance

### Considerations
* unfortunately, there is no good solution that allows Singletons to be
subclassed
    * make the constructor protected instead of private
    * but you cannot override the static instance() method
* possible solution:
    * let instance() method read information from an environment variable what 
    kind of MazeFactory it should build
    * requires rewriting the instance() method every time a subclass is added.
    * in Java, a solution would be to give instance() a String-typed parameter 
    with the name of the factory, and to use reflection to create an object
* other languages have built-in support for singletons
    * e.g., Scala lets you declare an object