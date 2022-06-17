package com.company.Basics.Loops_Conditions.LO1;

public class LO1_4 {
    public static void main(String[] args) {
        int amount = 27;
        if (amount % 3 == 0 && amount % 2 == 0)
            System.out.println("This is divisible by 3 and 2");
        else if (amount < 30)
            System.out.println("This is less than 30");
        else {
            System.out.println("Iets naar keuze");
        }
    }
}
