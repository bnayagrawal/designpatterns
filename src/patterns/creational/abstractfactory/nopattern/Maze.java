package patterns.creational.abstractfactory.nopattern;

import java.util.HashSet;
import java.util.Set;

public class Maze {
    public Maze() {
        System.out.println("creating a Maze");
    }
    public void addRoom(Room r) {
        if (!_rooms.contains(r)) {
            _rooms.add(r);
        }
    }
    private Set<Room> _rooms = new HashSet<Room>();
}