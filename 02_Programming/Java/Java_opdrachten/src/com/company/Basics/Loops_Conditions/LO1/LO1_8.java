package com.company.Basics.Loops_Conditions.LO1;

public class LO1_8 {
    public static void main(String[] args) {
        for (String dayOfTheWeek: new String[]{"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"}) {
            switch (dayOfTheWeek) {
            case "Monday":
                System.out.println("It's Monday");
                break;
            case "Saturday":
            case "Sunday":
                System.out.println("It's the weekend!");
                break;
            default:
                System.out.println("It's not Monday");
        }
        }
    }
}
