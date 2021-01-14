package patterns.creational.builder;

import patterns.creational.builder.products.CountingMazeBuilder;
import patterns.creational.builder.products.MazeGame;
import patterns.creational.builder.products.StandardMazeBuilder;
import common.maze.Maze;

public class Demo {
    public static void main(String[] args) {
        MazeGame mg = new MazeGame();
        Maze m = mg.createMaze(new StandardMazeBuilder());
        System.out.println(m);

        CountingMazeBuilder cmb = new CountingMazeBuilder();
        mg.createMaze(cmb);
        System.out.println("rooms = "+cmb.getRooms());
        System.out.println("doors = "+cmb.getDoors());
    }
}
