package com.ahelord.lenguaje;

import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        Locale uk = new Locale("en","GB");
        System.out.println(uk);
        Locale us = new Locale("en","US");
        System.out.println(us);
        System.out.println(Locale.getDefault());
    }
}
