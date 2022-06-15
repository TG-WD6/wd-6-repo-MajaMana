package com.company.Basics.Modifiers_More;

public class Car {
    public String color;

    public Car(String color) {
        this.color = color;
    }

    public static void main(String[] args) {
        Car bicycle = new Car("red");
        System.out.println(bicycle);
    }
}
