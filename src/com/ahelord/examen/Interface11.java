package com.ahelord.examen;

@FunctionalInterface
interface FuncInteface {

    int sum = 0;

    final static int divisor = 3;



    default void product() {
        System.out.println(3);
    }

    abstract int remainder(int x, int y);



    private int count() {
        return sum;
    }
}