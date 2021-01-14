package patterns.creational.abstractfactory.products;

import common.maze.Door;
import common.maze.Maze;
import common.maze.Room;
import common.maze.Wall;

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