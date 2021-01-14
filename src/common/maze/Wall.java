package common.maze;

// Cloneable is implemented to support Prototype pattern only
// Java performs 'shallow' clone only
public class Wall extends MapSite implements Cloneable {
    public Wall() {
        _wallNr = _wallCnt++;
        System.out.println("creating Wall #" + new Integer(_wallNr).toString());
    }
    public String toString() {
        return "Wall #" + new Integer(_wallNr).toString();
    }
    private int _wallNr;
    private static int _wallCnt = 1;

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}