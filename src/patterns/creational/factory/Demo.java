package patterns.creational.factory;

import common.maze.Maze;
import patterns.creational.factory.products.EnchantedMazeGame;
import patterns.creational.factory.products.MazeGame;

public class Demo {
    public static void main(String[] args) {
        MazeGame game = new EnchantedMazeGame();
        Maze maze = game.createMaze();
    }
}
