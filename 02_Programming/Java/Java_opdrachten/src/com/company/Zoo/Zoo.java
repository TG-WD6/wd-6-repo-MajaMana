package com.company.Zoo;
import java.util.ArrayList;

public class Zoo {
    ArrayList<Animal> zooAnimals = new ArrayList<>();
    int daysRunning = 0;

    public void display() {
        for (Animal zooAnimal : zooAnimals) {
            System.out.println(zooAnimal);
        }
    }

    public Zoo(Animal[] animals) {
        for (Animal animal : animals) {
            zooAnimals.add(animal);
        }
    }

    public void addAnimal(Animal animal) {
        zooAnimals.add(animal);
    }

    public void removeAnimal(Animal animal) {
        zooAnimals.remove(animal);
    }

    public void removeLastAnimal() {
        zooAnimals.remove(zooAnimals.size() - 1);
    }

    public void newDay() {
        System.out.println(++daysRunning);
        Bird newBird = new Bird("Bird", "Homeless", "Jungle");
        this.addAnimal(newBird);
    }

    public static void main(String[] args) {
        Bird light = new Bird("Bird","Light", "Jungle");
        Bird kira = new Bird("Bird","Kira", "Jungle");

        Reptile basil = new Reptile("Reptile","Basil", "Forest");
        Reptile medusa = new Reptile("Reptile","Medusa", "Forest");

        Cat forest = new Cat("Cat","Forest", "Savannah");
        Cat morticia = new Cat("Cat","Morticia", "Forest");
        Cat aurora = new Cat("Cat","Aurora", "Forest");
        Cat salem = new Cat("Cat","Salem", "Savannah");

        Zoo zoo = new Zoo(new Animal[] {light, kira, basil, medusa, forest, morticia, aurora, salem});
        Bird lorita = new Bird("Bird", "Lorita", "Jungle");
        zoo.addAnimal(lorita);
        zoo.display();
        zoo.removeAnimal(lorita);
        zoo.display();
        /*
         zoo.removeLastAnimal();
         zoo.printAnimals();
        */
        zoo.newDay();
        zoo.newDay();
        zoo.display();

    }
}
