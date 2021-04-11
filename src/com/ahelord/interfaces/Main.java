package com.ahelord.interfaces;

public class Main {
    public static void main(String[] args) {
        Mammal<Hamster> mamal = new Mammal<>();
        mamal.setAnimal(new Hamster());
        System.out.println(mamal.getAnimal());

        Mammal<Cow> mamalTwo = new Mammal<>();
        mamalTwo.setAnimal(new Cow());
        System.out.println(mamalTwo.getAnimal());

        System.out.println(mamalTwo.toString().compareTo(mamal.toString()));

    }
}
