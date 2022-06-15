package com.company.Basics.Modifiers_More;

public class Car4 {

    String color;
    String name;
    public Car4 (String color) {
        this.color = color;
    }

    public Car4 (String color, String name) {
        this.color = color;
        this.name = name;
    }

    public static void main(String[] args) {
        Car4 audi = new Car4("blue");
        System.out.println(audi.color);

        // Car4 bmw = new Car4();
        //   System.out.println(bmw);
    }
}
