package com.company.Zoo;

import java.util.Random;

public class Animal {
    public String type;
    public String name;
    public String environment;
    public int feedingFrequency;
    public int feedingAmount;
    public int id;

    public Animal(String type, String name, String environment, int feedingFrequency, int feedingAmount) {
        this.type = type;
        this.name = name;
        this.environment = environment;
        this.feedingFrequency = feedingFrequency;
        this.feedingAmount = feedingAmount;
        this.id = new Random().nextInt(100);
    }

    public String toString() {
        return "ID: "+ this.id + "\nType: " + this.type + "\nName: " + this.name + "\nEnvironment: " + this.environment + "\n";
    }
}
