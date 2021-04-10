package com.ahelord.herenciaTest;

public class Cat extends Animal{

    public Cat(int weight) {
        super(weight);
    }
    // override no es obligatorio pero se necesita para que el compilador detecte que debe ser la misma firma del
    // metodo del padre
    @Override
    public int getWeight() {
        return 1;
    }
}
