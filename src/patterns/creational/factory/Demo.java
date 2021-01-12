package patterns.creational.factory;

import patterns.creational.Maze;
import patterns.creational.factory.products.EnchantedMazeGame;

public class Demo {
    public static void main(String[] args) {
        MazeGame game = new EnchantedMazeGame();
        Maze maze = game.createMaze();
    }
}
