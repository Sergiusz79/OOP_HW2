package org.example;

import java.util.List;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
    Robot robot = new Robot("Robot");
    Human human = new Human("Human");
    Cat cat = new Cat("Cat");
    Treadmill treadmill = new Treadmill(15);
    Wall wall = new Wall(10);

    List<Parent> participants = List.of(human, robot, cat);
    List<Parent> obstacles = List.of(treadmill, wall);

        robot.run();
        human.run();
        cat.run();
        robot.jump();
        human.jump();
        cat.jump();




    }
}