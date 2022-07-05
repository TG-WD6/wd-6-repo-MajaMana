package com.company.Zoo;

public class Bird extends Animal {
    public static int feedingFrequency = 2;
    public Bird(String type, String name, String environment) {
        super(type, name, environment);
    }
    public Bird(String type, String name, String environment, int daysSinceFed) {
        super(type, name, environment, daysSinceFed);
    }

    public boolean isTimeToFeed() {
        if (feedingFrequency == daysSinceFed) {
            System.out.println(this.name + " needs to be fed!");
            return true;
        }
        if (feedingFrequency < daysSinceFed) {
            System.out.println(this.name + " is starving!");
            return true;
        }
        return false;
    }

    public void feed() {
        System.out.println("Feeding " + this.name + "\n");
        daysSinceFed = 0;
    }
}
