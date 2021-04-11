package com.ahelord.interfaces;

public class Mammal<T> {
    private T animal;

    public T getAnimal() {
        return animal;
    }

    public void setAnimal(T animal) {
        this.animal = animal;
    }


}
