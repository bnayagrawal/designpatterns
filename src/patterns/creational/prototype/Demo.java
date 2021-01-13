package patterns.creational.prototype;

import patterns.creational.Door;
import patterns.creational.Maze;
import patterns.creational.Room;
import patterns.creational.Wall;
import patterns.creational.abstractfactory.MazeGame;
import patterns.creational.abstractfactory.products.MazeFactory;
import patterns.creational.prototype.products.MazePrototypeFactory;

public class Demo {
    public static void main(String[] args) {
        MazeGame game = new MazeGame();

        Maze mazeProto = new Maze();
        Wall wallProto = new Wall();
        Room roomProto = new Room();
        Door doorProto = new Door(roomProto,roomProto);

        MazeFactory factory =
                new MazePrototypeFactory(mazeProto, wallProto,
                        roomProto, doorProto);
        game.createMaze(factory);
    }
}
