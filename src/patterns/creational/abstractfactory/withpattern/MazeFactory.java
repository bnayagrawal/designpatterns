package patterns.creational.abstractfactory.withpattern;

import patterns.creational.abstractfactory.nopattern.Door;
import patterns.creational.abstractfactory.nopattern.Maze;
import patterns.creational.abstractfactory.nopattern.Room;
import patterns.creational.abstractfactory.nopattern.Wall;

public class MazeFactory {
    public Maze makeMaze() {
        return new Maze();
    }
    public Wall makeWall() {
        return new Wall();
    }
    public Room makeRoom() {
        return new Room();
    }
    public Door makeDoor(Room r1, Room r2) {
        return new Door(r1, r2);
    }
}