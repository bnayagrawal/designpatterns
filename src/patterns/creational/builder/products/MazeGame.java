package patterns.creational.builder.products;

import common.maze.Maze;

public class MazeGame {
    public Maze createMaze(MazeBuilder mazeBuilder) {
        mazeBuilder.buildRoom(1);
        mazeBuilder.buildRoom(2);
        mazeBuilder.buildDoor(1,2);
        return mazeBuilder.getMaze();
    }
}