package com.company.Zoo;

import java.util.Random;

public abstract class Animal {
    public String type;
    public String name;
    public String environment;
    public static int feedingFrequency;
    public int daysSinceFed = 0;
    public int id;

    public Animal(String type, String name, String environment) {
        this.type = type;
        this.name = name;
        this.environment = environment;
        this.id = new Random().nextInt(100);
    }

    public Animal(String type, String name, String environment, int daysSinceFed) {
        this.type = type;
        this.name = name;
        this.environment = environment;
        this.daysSinceFed = daysSinceFed;
        this.id = new Random().nextInt(100);
    }

    public String toString() {
        return "ID: "+ this.id + "\nType: " + this.type + "\nName: " + this.name + "\nEnvironment: " + this.environment + "\n";
    }

    public abstract boolean isTimeToFeed();

    public abstract void feed();
}
