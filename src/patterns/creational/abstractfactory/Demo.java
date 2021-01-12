package patterns.creational.abstractfactory;

import patterns.creational.abstractfactory.products.EnchantedMazeFactory;
import patterns.creational.abstractfactory.products.MazeFactory;

public class Demo {
    public static void main(String[] args) {
        MazeFactory factory = new MazeFactory();
        MazeGame game = new MazeGame();
        game.createMaze(factory);

        // Using a custom maze (Possible due to change in pattern)
        EnchantedMazeFactory enchantedMazeFactory = new EnchantedMazeFactory();
        MazeGame game1 = new MazeGame();
        game1.createMaze(enchantedMazeFactory);
    }
}