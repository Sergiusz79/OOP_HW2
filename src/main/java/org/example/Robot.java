package org.example;

import lombok.Getter;

@Getter
public class Robot extends Parent {

    protected Robot (String type, Integer speedRun, Integer highJump) {
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
