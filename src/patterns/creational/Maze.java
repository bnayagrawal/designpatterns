package patterns.creational;

import java.util.HashMap;
import java.util.Map;

// Cloneable is implemented to support Prototype pattern only
// Java performs 'shallow' clone only
public class Maze implements Cloneable {
    public Maze() {
        System.out.println("creating a Maze");
    }
    public void addRoom(Room r) {
        if (!_rooms.containsValue(r)) {
            _rooms.put(r.getRoomNumber(), r);
        }
    }

    public boolean hasRoom(int roomNumber) {
        return _rooms.containsKey(roomNumber);
    }

    public Room getRoom(int roomNumber) {
        return _rooms.get(roomNumber);
    }

    private Map<Integer, Room> _rooms = new HashMap<Integer, Room>();

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}