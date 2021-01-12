package patterns.creational.builder.products;

import patterns.creational.Maze;

public class CountingMazeBuilder implements MazeBuilder {
    private int rooms = 0;
    private int doors = 0;

    @Override
    public void buildRoom(int r) {
        rooms++;
    }

    @Override
    public void buildDoor(int roomFrom, int roomTo) {
        doors++;
    }

    @Override
    public Maze getMaze() {
        return null;
    }

    public int getDoors() { return doors; }
    public int getRooms() { return rooms; }
}