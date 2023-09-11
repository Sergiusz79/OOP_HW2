package org.example;

public class Human extends Parent {
    protected Human (String type) {
        super.type = type;
    }

    @Override
    void run() {
        System.out.println(this.type + " did a step");
    }

    @Override //Ctrl+O
    void jump() {
        System.out.println(this.type + " is jumping");
    }
}
