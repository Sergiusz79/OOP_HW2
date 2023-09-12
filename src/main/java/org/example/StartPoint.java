package org.example;

import java.util.List;


public class StartPoint {
    public static void main(String[] args) {

        Robot robot = new Robot("Robot", 10, 10);
        Human human = new Human("Human", 5, 5);
        Cat cat = new Cat("Cat", 15, 15);

        Treadmill treadmill1 = new Treadmill("Treadmill_1", 4);
        Treadmill treadmill2 = new Treadmill("Treadmill_2", 8);
        Treadmill treadmill3 = new Treadmill("Treadmill_3", 14);
        Wall wall1 = new Wall("Wall_1", 4);
        Wall wall2 = new Wall("Wall_2", 9);
        Wall wall3 = new Wall("Wall_3", 14);

        List<Parent> participants = List.of(human, robot, cat);
        List<Obstacles> obstacles = List.of(treadmill1, wall1, treadmill2, wall2, treadmill3, wall3);
        overcomingAnObstacle(participants, obstacles);
    }

    private static void overcomingAnObstacle(List<Parent> participants, List<Obstacles> obstacles) {
        for (int i = 0; i < participants.size(); i++) {
            participants.get(i).hallo();
            for (int j = 0; j < obstacles.size(); j++) {
                if (obstacles.get(j).getClass().equals(Treadmill.class)) {
                    if (participants.get(i).lengthRun < obstacles.get(j).length) {
                        System.out.println(participants.get(i).type + " was unable to run the " +
                                obstacles.get(j).type + " and leaves the competition! :(");
                        i++;
                        participants.get(i).hallo();
                        j = -1;
                    } else {
                        System.out.println(participants.get(i).type + " successfully ran the " +
                                obstacles.get(j).type + "! :)");
                    }
                } else {
                    if (participants.get(i).highJump < obstacles.get(j).height) {
                        System.out.println(participants.get(i).type +
                                " was unable to jump over the " + obstacles.get(j).type +
                                " and leaves the competition! :(");
                        i++;
                        participants.get(i).hallo();
                        j = -1;
                    } else {
                        System.out.println(participants.get(i).type + " jumped over an " +
                                obstacles.get(j).type + "! :)");
                    }
                }
            }
        }
    }


}