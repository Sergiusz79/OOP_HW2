package org.example;

import lombok.Getter;
@Getter
public class Human extends Parent {

    protected Human (String type, Integer speedRun, Integer highJump) {
        super.type = type;
        super.speedRun = speedRun;
        super.highJump = highJump;
    }

    @Override
    void run() {
        System.out.println(this.type + " run!");
    }

    @Override //Ctrl+O
    void jump() {
        System.out.println(this.type + " is jumping!");
    }
}
