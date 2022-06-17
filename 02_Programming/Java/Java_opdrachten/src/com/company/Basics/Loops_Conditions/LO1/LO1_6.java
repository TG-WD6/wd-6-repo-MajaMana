package com.company.Basics.Loops_Conditions.LO1;

public class LO1_6 {
    public static void main(String[] args) {
        String dayOfTheWeek;
        dayOfTheWeek = "Saturday";
        switch (dayOfTheWeek) {
            case "Saturday":
            case "Sunday":
                System.out.println("It's the weekend!");
                break;
            default:
                System.out.println("What day is it?");
        }
    }
}
