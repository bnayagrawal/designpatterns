package patterns.creational.abstractfactory.withpattern.products;

import patterns.creational.abstractfactory.nopattern.Door;
import patterns.creational.abstractfactory.nopattern.Room;
import patterns.creational.abstractfactory.withpattern.MazeFactory;

public class EnchantedMazeFactory extends MazeFactory {
    public EnchantedRoom makeRoom() {
        return new EnchantedRoom(castSpell());
    }
    public Door makeDoor(Room r1, Room r2) {
        return new DoorNeedingSpell(r1, r2);
    }
    protected static Spell castSpell() {
        return new Spell();
    }
}