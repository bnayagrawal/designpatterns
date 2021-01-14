package patterns.creational.abstractfactory.products;

import common.maze.Room;

public class EnchantedRoom extends Room {
    public EnchantedRoom(Spell s) {
        super();
        /* ... */
    }
    public String toString() {
        return "enchanted " + super.toString();
    }
}
