package com.ahelord.matematicas;

public class Main {
    public static void main(String[] args) {
        // la clase math provee varias operaciones matematicas
        double a = 1.99, b =2.99, c= 0;
        c= Math.cos(a);
        System.out.println(c);
        c = Math.exp(a);
        System.out.println(c);
        c = Math.random();
        System.out.println(c);
        c= Math.pow(a,b);
        System.out.println(c);
        int f = 11, g = 3;
        long o = Math.round(f/g);
        // como puede definir otros sistemas numericos Java no sabe que tipo es el ingresado
        //  por lo cual no podriamos saber los decimales
        // lo que se debe hacer es transformar al sistema indicado
        double z = Math.round((double) f/g*100)/100.0;
        System.out.println(z);
    }
}
