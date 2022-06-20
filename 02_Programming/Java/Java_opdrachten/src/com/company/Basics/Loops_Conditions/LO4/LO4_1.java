package com.company.Basics.Loops_Conditions.LO4;

import java.util.ArrayList;
public class LO4_1 {
    public static void main(String[] args) {
        ArrayList<Integer> fibonacci = new ArrayList<>();
        fibonacci.add(0);
        fibonacci.add(1);
        for (int i = 2; i < 51; i++) {
            fibonacci.add(i);
        }
        System.out.println(fibonacci);
    }
}
