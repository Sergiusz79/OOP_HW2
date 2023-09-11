package org.example;

import java.util.List;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
    Robot robot = new Robot("Robot", 10,10);
    Human human = new Human("Human", 5, 5);
    Cat cat = new Cat("Cat", 15, 15);

    Treadmill treadmill1 = new Treadmill(13);
        Treadmill treadmill2 = new Treadmill(8);
        Treadmill treadmill3 = new Treadmill(4);
    Wall wall1 = new Wall(14);
        Wall wall2 = new Wall(9);
        Wall wall3 = new Wall(4);

    List<Parent> participants = List.of(human, robot, cat);
    List<Object> obstacles = List.of(treadmill1, wall1, treadmill2, wall2, treadmill3, wall3);





        robot.run();
        human.run();
        cat.run();
        robot.jump();
        human.jump();
        cat.jump();




    }
}