## Factory Method
* define an interface for creating an object, but let subclasses decide which class to
instantiate
* Factory Method lets you create objects in a separate operation so that they can be
overridden by subclasses

#### Use Factory Method when
* a class can’t anticipate the class of objects it must create
* a class wants its subclasses to specify the objects it creates

#### Participants:
* Product
    * defines the interface of objects created by the factory method
* ConcreteProduct
    * implements the Product interface
* Creator
    * declares the factory method, which returns a Product
    * may define default implementation that returns a default ConcreteProduct object
    * may call factory method to create a Product
* ConcreteCreator
    * overrides the factory method to return a ConcreteProduct
    
### Factory Method vs Abstract Factory
* Abstract factories are often implemented using factory methods
    * class AbstractFactory contains the FactoryMethods that are overridden in class ConcreteFactory
    * factory is passed to Client as a parameter
    * Client invokes factory methods on this parameter
    
* Note: AbstractFactory can also be implemented using Prototype    