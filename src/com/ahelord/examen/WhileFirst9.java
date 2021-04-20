package com.ahelord.examen;

public class WhileFirst9
{
    public static void main(String[] args) {
//What is the value of x after the fourth iteration?
        int x = 0;
        while(x < 100){
            if(x%2 == 1){
                x++;
            }
            else if(x%2 == 0){
                x += 3;
            }
            System.out.println(x);
        }
    }
}
