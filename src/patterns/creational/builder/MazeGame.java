package patterns.creational.builder;

import patterns.creational.Maze;
import patterns.creational.builder.products.MazeBuilder;

public class MazeGame {
    public Maze createMaze(MazeBuilder mazeBuilder) {
        mazeBuilder.buildRoom(1);
        mazeBuilder.buildRoom(2);
        mazeBuilder.buildDoor(1,2);
        return mazeBuilder.getMaze();
    }
}