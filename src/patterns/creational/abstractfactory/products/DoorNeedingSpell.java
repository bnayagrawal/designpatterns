package patterns.creational.abstractfactory.products;

import patterns.creational.Door;
import patterns.creational.Room;

class DoorNeedingSpell extends Door {
    DoorNeedingSpell(Room r1, Room r2) {
        super(r1, r2);
        /* ... */
    }
    public String toString() {
        return super.toString() +
                " (needing spell)";
    }
}