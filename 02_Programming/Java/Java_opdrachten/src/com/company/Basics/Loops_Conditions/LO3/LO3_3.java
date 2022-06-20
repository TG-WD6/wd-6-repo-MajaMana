package com.company.Basics.Loops_Conditions.LO3;

public class LO3_3 {
    public static void main(String[] args) {
        for (int i = 0; i < 11; i++) {
            if (i == 1) {
                continue;
            }
            if (i == 3) {
                continue;
            }
            if (i == 5) {
                continue;
            }
            if (i == 7) {
                continue;
            }
            if (i == 9) {
                continue;
            }
            System.out.println(i);
        }
    }
}
