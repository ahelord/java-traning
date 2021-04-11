package com.ahelord.arreglosyciclos;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] primes = new int[3];
        int[] primesTwo;
        primesTwo = new int[]{1,3,4};
        int[] primesThree = {2,3,4};
       int[][] matrix = new int[2][3];
       int[][] matrixTwo = {{1,4,5},{6,7,8}};
       char[] myCharsOne = {'a','b','c','d'};
       char[] myCharsTwo = {'d','f',' ',' ',' '};
        System.arraycopy(myCharsOne,2,myCharsTwo,3,2);
        System.out.println(myCharsOne);
        char[] myCharsFour = Arrays.copyOf(myCharsOne,10);
        System.out.println(myCharsFour);
        int x = 0;
        while (x<10){
            x++;
            System.out.println(x);
        }
        int y = 0;
        do {
            y++;
            System.out.println(y);
        }while (y<10);

        for (int i = 0; i < primesThree.length; i++) {
            int value = primesThree[i];
            System.out.println(value);
        }
        // forEach
        for(int value:primesThree){
            System.out.println(value);

        }
        int sum = 0;
        for (int z = 0; z < primesThree.length; sum+=z++) {
            int value = myCharsOne[z];
            System.out.println(value);
            System.out.println(sum);
        }

        for (int j = 0 , r = 0 ; !(j==2 || r==-1) ;  j++,r++) {
            int value = matrixTwo[j][r];
            System.out.println(value);

        }

        outerLoopLabel:
        for(int [] row:matrixTwo){
            for(int value:row){
                System.out.println("cycle outerLoopLabel"+value);
                if(value == 1) continue outerLoopLabel;
                if(value == 7) break outerLoopLabel;

            }
        }

    }
}
