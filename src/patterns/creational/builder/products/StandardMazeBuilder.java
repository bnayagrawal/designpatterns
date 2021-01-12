package patterns.creational.builder.products;

import patterns.creational.*;

public class StandardMazeBuilder implements MazeBuilder {

    private Maze currentMaze;
    public Maze getMaze() {
        if(currentMaze == null)
            currentMaze = new Maze();
        return currentMaze;
    }

    public void buildRoom(int r) {
        if(!getMaze().hasRoom(r)) {
            Room room = new Room();
            getMaze().addRoom(room);
            room.setSide(Direction.North, new Wall());
            room.setSide(Direction.East, new Wall());
            room.setSide(Direction.South, new Wall());
            room.setSide(Direction.West, new Wall());
        }
    }

    public void buildDoor(int r1, int r2) {
        Room room1 = getMaze().getRoom(r1);
        Room room2 = getMaze().getRoom(r2);
        if( room1 == null ) {
            buildRoom(r1);
            room1 = getMaze().getRoom(r1);
        }
        if( room2 == null ) {
            buildRoom(r2);
            room2 = getMaze().getRoom(r2);
        }

        Door door = new Door(room1, room2);
        room1.setSide(Direction.East, door);
        room2.setSide(Direction.West, door);
    }
}
