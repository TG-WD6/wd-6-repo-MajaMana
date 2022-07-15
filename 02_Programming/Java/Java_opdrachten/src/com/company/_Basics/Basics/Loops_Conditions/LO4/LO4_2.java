package com.company._Basics.Basics.Loops_Conditions.LO4;
import java.util.ArrayList;
import java.util.Collections;
public class LO4_2 {
    public static void main(String[] args) {
        ArrayList<Integer> fibonacci = new ArrayList<>();
        fibonacci.add(2);
        fibonacci.add(7);
        fibonacci.add(5);
        fibonacci.add(10);
        fibonacci.add(4);
        fibonacci.add(9);
        fibonacci.add(3);
        fibonacci.add(1);
        fibonacci.add(8);
        fibonacci.add(6);

        Collections.sort(fibonacci);

        for (int i : fibonacci) {
            System.out.println(i);
        }
    }
}
