package patterns.creational.abstractfactory.withpattern.products;

import patterns.creational.abstractfactory.nopattern.Room;

class EnchantedRoom extends Room {
    EnchantedRoom(Spell s) {
        super();
        /* ... */
    }
    public String toString() {
        return "enchanted " + super.toString();
    }
}
