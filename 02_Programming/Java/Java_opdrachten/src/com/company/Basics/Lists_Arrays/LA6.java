package com.company.Basics.Lists_Arrays;

import java.util.ArrayList;
public class LA6 {
    public static void main(String[] args) {
        ArrayList<String> cats = new ArrayList<>();
        cats.add("Forest");
        cats.add("Morticia");
        cats.add("Aurora");
        cats.add("Salem");
        System.out.println(cats);
        System.out.println(cats.size());

        cats.remove("Morticia");
        cats.remove("Aurora");
        cats.remove("Salem");
        System.out.println(cats);
        System.out.println(cats.size());
    }
}
