package patterns.creational.prototype.products;

import patterns.creational.Door;
import patterns.creational.Maze;
import patterns.creational.Room;
import patterns.creational.Wall;
import patterns.creational.abstractfactory.products.MazeFactory;

public class MazePrototypeFactory extends MazeFactory {
    public MazePrototypeFactory(Maze m, Wall w, Room r, Door d) {
        prototypeMaze = m;
        prototypeWall = w;
        prototypeRoom = r;
        prototypeDoor = d;
    }

    public Maze makeMaze() {
        Maze maze;
        try {
            maze = (Maze) prototypeMaze.clone();
        } catch (CloneNotSupportedException e) {
            throw new Error();
        }
        return maze;
    }

    public Room makeRoom() {
        Room room;
        try {
            room = (Room) prototypeRoom.clone();
        } catch (CloneNotSupportedException e) {
            throw new Error();
        }
        return room;
    }

    public Wall makeWall() {
        Wall wall;
        try {
            wall = (Wall) prototypeWall.clone();
        } catch (CloneNotSupportedException e) {
            throw new Error();
        }
        return wall;
    }

    public Door makeDoor(Room r1, Room r2) {
        Door door;
        try {
            door = (Door) prototypeDoor.clone();
        } catch (CloneNotSupportedException e) {
            throw new Error();
        }
        door.initialize(r1, r2);
        return door;
    }

    private Maze prototypeMaze;
    private Wall prototypeWall;
    private Room prototypeRoom;
    private Door prototypeDoor;
}