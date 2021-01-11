package patterns.creational.abstractfactory.withpattern.products;

import patterns.creational.abstractfactory.nopattern.Door;
import patterns.creational.abstractfactory.nopattern.Room;

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