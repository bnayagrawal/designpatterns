package patterns.creational.abstractfactory.products;

import patterns.creational.Door;
import patterns.creational.Room;

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