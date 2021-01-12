#### The code in MazeGame.createMaze() is not very flexible:
* the layout of the maze is hard-wired
* the types of Rooms, Doors, Walls are hard-coded
* There is no mechanism for adding new components such as DoorNeedingSpell, EnchantedRoom
Currently, any change to the structure or the components of the maze
requires a complete rewrite of class MazeGame
