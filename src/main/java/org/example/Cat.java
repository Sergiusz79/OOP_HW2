package org.example;

import lombok.Getter;

@Getter
public class Cat extends Parent {


    protected Cat (String type, Integer lengthRun, Integer highJump) {
        super.type = type;
        super.lengthRun = lengthRun;
        super.highJump = highJump;
    }

    @Override
    public void hallo() {
        System.out.println("Hallo! I am " + this.type);
    }
}
