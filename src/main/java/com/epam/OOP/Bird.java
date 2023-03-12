package com.epam.OOP;

public class Bird extends Animal {

    @Override
    public String getDescription() {
        return super.getDescription() + " Moreover, it has 2 wings and can fly.";
    }

    public Bird() {
        super("blue", 2, false);
    }
}
