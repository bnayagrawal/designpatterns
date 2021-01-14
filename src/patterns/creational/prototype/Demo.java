package patterns.creational.prototype;

import common.maze.Door;
import common.maze.Maze;
import common.maze.Room;
import common.maze.Wall;
import patterns.creational.abstractfactory.products.MazeGame;
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
