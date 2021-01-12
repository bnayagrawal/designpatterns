
Builder Pattern
----------------
Separate the construction of a complex object from its
representation so that the same construction process can
create different representations.

#### Use When
* the algorithm for creating a complex object should be independent
of the parts that make up the object and how they're assembled
* the construction process must allow different representations for
the object that's constructed
* The way parts may be linked together may be different. (unlike
our maze)

### Participants
* Builder
    * specifies an abstract interface for creating parts of a Product object
* Concrete Builder
    * constructs and assembles parts of the product by implementing the Builder interface
    * defines and keeps track of the representation it creates
    * provides an interface for retrieving the product 
* Director
    * constructs an object using the Builder interface
* Product
    * represents the complex object under construction.
    * includes classes that define the constituent parts, including interfaces for assembling the parts into the final result
    
### Collaborations
* The client creates the Director object and configures it with the Builder object.
* Director notifies the builder whenever a part of the product should be built.
* Builder handles requests from the director and adds parts to the product.
* The client retrieves the product from the builder. 