package patterns.creational.withoutdp;

import patterns.creational.withoutdp.products.MazeGame;

public class Demo {
    public static void main(String[] args) {
        MazeGame game = new MazeGame();
        game.createMaze();

        // Here creating different type of maze is not possible
    }
}
