package com.ahelord.condicionales;

public class Main {
    public static void main(String[] args) {
        // se puede utilizar && (circuito corto) y & (circuito completo), || & |
        // sabemos que segun la operacion condicional or o and puedo saber si evaluar la
        // segunda parte del
        int a = 3, b = 2;
        boolean c = false;
        c = (a > b && ++b == 3);
        System.out.println(c);
        c = (a > b && ++b == 3);
        System.out.println(c);
        c = (a < b | ++b == 3);
        System.out.println(c);
        if (a > b) System.out.println("correcto");
        int j = (a >= b) ? a : b;
        System.out.println(j);

        // solo se puede hacer switch con byte, short, int , string, enum
       /* long myLong = 12312312312312L;
        switch (myLong){

        }*/

        switch (a){
            case 1:
                a+=1;
                // si no hay break y cae en el caso se sigue ejecutando hasta encontrarlo
            case 2:
                b++;
            case 3:
                b--;
                break;
        }
    }
}
