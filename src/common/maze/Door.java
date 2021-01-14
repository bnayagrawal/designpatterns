package common.maze;

// Cloneable is implemented to support Prototype pattern only
// Java performs 'shallow' clone only
public class Door extends MapSite implements Cloneable {
    public Door(Room r1, Room r2) {
        _doorNr = _doorCnt++;
        System.out.println("creating a Door #" + _doorNr + " between " + r1
                + " and " + r2);
        _room1 = r1;
        _room2 = r2;
    }
    public String toString() {
        return "Door #" + new Integer(_doorNr).toString();
    }
    private static int _doorCnt = 1;
    private int _doorNr;
    private Room _room1;
    private Room _room2;

    // [Needed because of Prototype pattern]
    public void initialize(Room r1, Room r2) {
        _room1 = r1;
        _room2 = r2;
        System.out.println("initializing Door #" +
                _doorNr + " between " + r1 + " and " + r2);
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}