package com.ahelord.herenciaTest;

/**
 * {@code Dog} dog class
 * @author leonardo rodriguez
 * @version 1.0
 */

public class Dog extends Animal {

    public Dog(int weight) {
        super(weight);
    }

    /**
     * @author leonardo rodriguez
     * Method with {@link java.lang.String String}
     * {@code giveMeBall} message when give ball
     * Un metodo para obtener la pelota
     * @return devuelve el texto de la mascota
     */
    public String giveMeBall() {
        return "woof and my weight is "+super.weight;
    }
}
