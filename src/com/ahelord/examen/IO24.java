package com.ahelord.examen;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class IO24 {
    public static void main(String[] args) {

        // Which two changes, made together, allow this code to compile? (Choose two)
        try {
            InputStream in = new FileInputStream("missingfile.txt");
            in.read();
            in.close();
        }
        catch(FileNotFoundException e) {
            System.out.println(e.getClass().getName());
        }
        catch(IOException e) {
            System.out.println(e.getClass().getName());
        }
    }
}
