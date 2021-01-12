package patterns.creational.abstractfactory.products;

import patterns.creational.Door;
import patterns.creational.Room;

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