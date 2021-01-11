replace explicit constructor calls with dynamic dispatch; use overriding
to change kinds of Rooms. → Factory Method

▪ pass object to createMaze() that knows how to create Rooms; create
different kinds of Rooms by passing another object. → Abstract Factory

▪ parameterize createMaze() with prototypical Room object which it copies
and adds to the maze; change the maze composition by passing
different prototype. → Prototype

▪ ensure that there is one maze per game, in a way that all objects have
easy access to it.→ Singleton