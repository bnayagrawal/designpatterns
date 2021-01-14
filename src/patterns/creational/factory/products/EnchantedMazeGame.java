package patterns.creational.factory.products;

import common.maze.Door;
import common.maze.Room;
import patterns.creational.abstractfactory.products.DoorNeedingSpell;
import patterns.creational.abstractfactory.products.EnchantedRoom;
import patterns.creational.abstractfactory.products.Spell;

public class EnchantedMazeGame extends MazeGame {
    public Room makeRoom() {
        return new EnchantedRoom(castSpell());
    }
    public Door makeDoor(Room r1, Room r2) {
        return new DoorNeedingSpell(r1, r2);
    }
    private Spell castSpell() {
        return new Spell();
    }
}