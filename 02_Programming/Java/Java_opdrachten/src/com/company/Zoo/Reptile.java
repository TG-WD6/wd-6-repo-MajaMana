package com.company.Zoo;

public class Reptile extends Animal {
    public static int feedingFrequency = 7;
    public Reptile(String type, String name, String environment) {
        super(type, name, environment);
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
