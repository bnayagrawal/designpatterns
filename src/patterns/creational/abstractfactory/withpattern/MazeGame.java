package patterns.creational.abstractfactory.withpattern;

import patterns.creational.abstractfactory.nopattern.Direction;
import patterns.creational.abstractfactory.nopattern.Door;
import patterns.creational.abstractfactory.nopattern.Maze;
import patterns.creational.abstractfactory.nopattern.Room;

class MazeGame {

    // This will allow use to create different types of maze
    public Maze createMaze(MazeFactory factory) {
        Maze aMaze = factory.makeMaze();
        Room r1 = factory.makeRoom();
        Room r2 = factory.makeRoom();
        Door theDoor = factory.makeDoor(r1, r2);
        aMaze.addRoom(r1);
        aMaze.addRoom(r2);
        r1.setSide(Direction.North, factory.makeWall());
        r1.setSide(Direction.East, theDoor);
        r1.setSide(Direction.South, factory.makeWall());
        r1.setSide(Direction.West, factory.makeWall());
        r2.setSide(Direction.North, factory.makeWall());
        r2.setSide(Direction.East, factory.makeWall());
        r2.setSide(Direction.South, factory.makeWall());
        r2.setSide(Direction.West, theDoor);
        return aMaze;
    }
}