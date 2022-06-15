package com.company.Basics.Modifiers_More;

public class Car {
    String color;

    public Car(String color) {
        this.color = color;
    }

    public static void main(String[] args) {
        Car audi = new Car("red");
        System.out.println(audi);
    }
}
