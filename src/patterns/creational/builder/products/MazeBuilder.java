package patterns.creational.builder.products;

import common.maze.Maze;

public interface MazeBuilder {
    void buildRoom(int room);
    void buildDoor(int roomFrom, int roomTo);
    Maze getMaze();
}
