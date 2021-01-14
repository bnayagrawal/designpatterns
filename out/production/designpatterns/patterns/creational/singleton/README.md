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
