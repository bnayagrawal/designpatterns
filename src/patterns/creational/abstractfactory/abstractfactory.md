Abstract Factory
----------------
provides an interface for creating families of related or dependent
objects without specifying their concrete classes

####Use AbstractFactory when
   * a system should be independent of how its products are created,
    composed, represented
    
   * a system should be configured with one or multiple families of
    products
    
   * a family of related product objects is designed to be used together
    and you need to enforce this constraint
    
   * you want to provide a class library of products, and you want to
    reveal just their interfaces, not their implementations
    
####Participants:

* AbstractFactory
    * declares interface for operations that create abstract products
* ConcreteFactory
    * implements operations to create concrete products
* AbstractProduct
    * declares an interface for a type of product object
* ConcreteProduct
    * defines the product object created by concrete factory
    * implements the AbstractProduct interface
* Client
    * uses only interfaces of AbstractFactory/AbstractProduct