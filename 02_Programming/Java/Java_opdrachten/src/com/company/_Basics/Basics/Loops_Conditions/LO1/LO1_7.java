package com.company._Basics.Basics.Loops_Conditions.LO1;

public class LO1_7 {
    public static void main(String[] args) {
        String dayOfTheWeek;
        dayOfTheWeek = "Friday";
        switch (dayOfTheWeek) {
            case "Friday":
                System.out.println("It's Friday!");
            case "Saturday":
            case "Sunday":
                System.out.println("It's the weekend!");
                break;
            default:
                System.out.println("What day is it?");
        }
    }
}
