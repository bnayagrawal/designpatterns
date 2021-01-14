package patterns.creational.abstractfactory.products;

import common.maze.Door;
import common.maze.Room;

public class DoorNeedingSpell extends Door {
    public DoorNeedingSpell(Room r1, Room r2) {
        super(r1, r2);
        /* ... */
    }
    public String toString() {
        return super.toString() +
                " (needing spell)";
    }
}