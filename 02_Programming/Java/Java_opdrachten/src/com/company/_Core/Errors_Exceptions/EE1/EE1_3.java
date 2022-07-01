package com.company._Core.Errors_Exceptions.EE1;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class EE1_3 {
    public static void main(String[] args) {
        Scanner scanner = null;

        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt"));
            writer.write("Hello world!");
            writer.close();
        } catch (Exception e) {
            e.printStackTrace();
        } //catch (IOException e) {
        //    e.printStackTrace();
        //}
    }
}
