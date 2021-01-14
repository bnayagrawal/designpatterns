package common.maze;

// Cloneable is implemented to support Prototype pattern only
// Java performs 'shallow' clone only
public class Room extends MapSite implements Cloneable {

    public Room() {
        _roomNr = _roomCnt++;
        System.out.println("creating Room #" + _roomNr);
    }

    public void setSide(Direction d, MapSite site) {
        switch (d) {
            case North:
                _northSide = site;
            case South:
                _southSide = site;
            case East:
                _eastSide = site;
            case West:
                _westSide = site;
        }
        System.out.println("setting " + d.toString() + " side of " + this.toString() + " to " +
                site.toString());
    }

    MapSite getSide(Direction d) {
        MapSite result = null;
        switch (d) {
            case North:
                result = _northSide;
            case South:
                result = _southSide;
            case East:
                result = _eastSide;
            case West:
                result = _westSide;
        }
        return result;
    }

    public String toString() {
        return "Room #" + new Integer(_roomNr).toString();
    }

    int getRoomNumber() {
        return _roomNr;
    }

    private int _roomNr;
    private static int _roomCnt = 1;
    private MapSite _northSide;
    private MapSite _southSide;
    private MapSite _eastSide;
    private MapSite _westSide;

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
