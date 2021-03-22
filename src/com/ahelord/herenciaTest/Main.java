package com.ahelord.herenciaTest;

public class Main {
    public static void main(String[] args) {
        Dog myDog = new Dog();
        myDog.setWeight(12);
        /*
       Esto es una prueba de herencia
         */
        System.out.println(myDog.getWeight()+myDog.giveMeBall());
    }
}
