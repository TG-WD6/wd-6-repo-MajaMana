package com.company.Basics.Modifiers_More;

public class Car5 {

    String color;

    public Car5 (String color) {
        this.color = color;
    }

    public Car5 () {
        color = "purple";
    }

    public static void main(String[] args) {
        Car5 audi = new Car5("blue");
        System.out.println(audi.color);

        Car5 bmw = new Car5("black");
        System.out.println(bmw.color);

        Car5 porsche = new Car5();
        System.out.println(porsche.color);
    }
}
