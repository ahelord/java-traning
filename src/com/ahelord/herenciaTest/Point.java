package com.ahelord.herenciaTest;
// es una clase que va al final de la jerarquia
public final class Point {
    int x;
    int y;

    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
