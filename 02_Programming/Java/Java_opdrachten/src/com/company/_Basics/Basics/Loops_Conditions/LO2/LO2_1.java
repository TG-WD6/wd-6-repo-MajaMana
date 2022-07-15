package com.company._Basics.Basics.Loops_Conditions.LO2;

public class LO2_1 {
    public static void main(String[] args) {
        int a = 6;
        int b = 3;

        boolean isMathFun1 = !(a == 7 && (b >= a || a != a));
        boolean isMathFun2 = a == b || !(b > 3);
        boolean isMathFun3 = !(b <= a && b != a + b);
        System.out.println(isMathFun1);
        System.out.println(isMathFun2);
        System.out.println(isMathFun3);
    }
}
