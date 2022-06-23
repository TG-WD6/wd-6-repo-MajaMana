package com.company.Zoo;
import java.util.ArrayList;

public class Zoo {
    ArrayList<Animal> zooAnimals = new ArrayList<>();

    public void printAnimals() {
        for (Animal zooAnimal : zooAnimals) {
            System.out.println("Name: " + zooAnimal.name + "\nEnvironment: " + zooAnimal.environment + "\n");
        }
    }

    public Zoo(Animal[] animals) {
        for (Animal animal : animals) {
            zooAnimals.add(animal);
        }
    }
}
