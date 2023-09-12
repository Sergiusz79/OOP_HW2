package org.example;

public abstract class Parent {
protected String type;
protected Integer lengthRun;
protected Integer highJump;

    @Override
    public String toString() {
        return "Type='" + type + '\'' +
                ", lengthRun=" + lengthRun +
                ", highJump=" + highJump;
    }


    public abstract void hallo ();

}

