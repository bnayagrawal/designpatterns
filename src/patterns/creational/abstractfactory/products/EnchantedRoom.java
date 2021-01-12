package patterns.creational.abstractfactory.products;

import patterns.creational.Room;

class EnchantedRoom extends Room {
    EnchantedRoom(Spell s) {
        super();
        /* ... */
    }
    public String toString() {
        return "enchanted " + super.toString();
    }
}
