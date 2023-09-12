package org.example;

public class Treadmill extends Obstacles {

    public Treadmill(String type, Integer length) {
        super.type = type;
        super.length = length;
    }


    @Override
    public String toString() {
        return "Treadmill{" +
                "length=" + length +
                '}';
    }
}
