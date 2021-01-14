package patterns.creational.singleton.products;

public class MazeFactory extends patterns.creational.abstractfactory.products.MazeFactory {
    private static MazeFactory _theFactory = null;
    private MazeFactory() { }
    public static MazeFactory instance() {
        if (_theFactory == null) {
            _theFactory = new MazeFactory();
        }
        return _theFactory;
    }
}
