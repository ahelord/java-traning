package com.ahelord.examen;

public class WhileSecond15 {
    public static void main(String[] args) {

//        What is the value of x after the fourth iteration?
        // cualquier modulo de 0 es 0

        int x = 0;
        while(x < 100){
            if(x%3 == 0){
                x += 3;
            }
            if(x%2 == 0){
                x += 2;
                // continuar se salta el  ciclo

                continue;
            }
            x++;
            System.out.println(x);
        // hasta que se acabe cuenta como ciclo
        }


    }
}
