package com.ahelord.herenciaTest;

// las clases principales de la jerarquia puede no ser utiles como instancia
// es igual que Figura qque es en si? no necesito las instancia de figura
// pero si necesit sus hijos y que implementen las cosas de la figura
public abstract class Shape {

    public abstract int getArea();
    public final String getCode(){
        return super.toString();
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
