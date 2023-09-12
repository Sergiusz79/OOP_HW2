package org.example;


public class Wall extends Obstacles{

    public Wall(String type, Integer height) {
        super.type = type;
        super.height = height;
    }



    @Override
    public String toString() {
        return "Wall{" +
                "height=" + height +
                '}';
    }
}
