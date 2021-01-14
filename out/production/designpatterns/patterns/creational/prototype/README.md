### Prototype
Specify the kinds of objects to create using a prototypical instance,
and create new objects by copying this prototype


### Applicability
Use the prototype pattern when a system should be independent of how,
it's products are created, composed, and represented; and
* when the classes to instantiate are specified at runtime, for example, 
by dynamic loading; or
* to avoid building a class hierarchy of the factories that parallels the
class hierarchy of products; or
* when instances of a class can have one of only a few different combinations
of state. It may be more convenient to install a corresponding number of 
prototypes and clone them rather than instantiating the class manually,
each time with the appropriate state.

### Benefits
* Similar to Abstract Factory and Builder:
    * Hide concrete product classes from the client
    * Let client work with application-specific classes without modification
* Additional benefits
    * Allows for addition of products at run-time
        * Especially important for applications that rely on dynamic loading to add classes after start of execution
* Reduced need for subclassing 
