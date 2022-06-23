package com.company.Zoo;

public class Main {
    public static void main(String[] args) {
        Bird light = new Bird("Light", "Jungle");
        Bird kira = new Bird("Kira", "Jungle");

        Reptile basil = new Reptile("Basil", "Forest");
        Reptile medusa = new Reptile("Medusa", "Forest");

        Cat forest = new Cat("Forest", "Savannah");
        Cat morticia = new Cat("Morticia", "Forest");
        Cat aurora = new Cat("Aurora", "Forest");
        Cat salem = new Cat("Salem", "Savannah");

        Zoo zoo = new Zoo(new Animal[] {light, kira, basil, medusa, forest, morticia, aurora, salem});
        zoo.printAnimals();
    }
}
