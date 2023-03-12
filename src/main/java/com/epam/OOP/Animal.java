package com.epam.OOP;

public class Animal {
    private final String color;

    private final int numberOfPaws;

    private final boolean hasFur;

    public Animal(String color, int numberOfPaws, boolean hasFur) {
        this.color = color;
        this.numberOfPaws = numberOfPaws;
        this.hasFur = hasFur;
    }

    public String getDescription() {
        String fur;
        String paws;
        if (hasFur) {
            fur = "a";
        } else fur = "no";

        if (numberOfPaws == 1) {
            paws = "paw";
        } else paws = "paws";
        return "This animal is mostly " + color + ". It has " + numberOfPaws + " " + paws + " and " + fur + " fur.";
    }
}