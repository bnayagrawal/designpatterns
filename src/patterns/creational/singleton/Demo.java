package patterns.creational.singleton;

import patterns.creational.abstractfactory.products.MazeGame;
import patterns.creational.singleton.products.MazeFactory;

public class Demo {
    public static void main(String[] args) {
        MazeFactory factory = MazeFactory.instance();
        MazeGame game = new MazeGame();
        game.createMaze(factory);
    }
}
