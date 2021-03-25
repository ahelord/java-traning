package com.ahelord.tiposdedatos;

public class Main {
    public static void main(String[] args) {
        //enteros
        byte myByte = 127;
        short myShort = 32767;
        int myInt = 2147483647;
        long myLong = 922337203685478099L;
        // numero de punto flotante
        float myFloat = 3.4028235E+38F;
        double myDouble = 3.7976931348623157E+307D;
        // Boolean
        boolean myBoolean = false;
        // Caracteres
        char myChar = 'z';
        // Los valores numericos pueden ser representados como binarios, octetos, decimales y hexadecimales
        int myBinary = 0b101010;
        short myOctal = 052;
        long myHex = 0x2A;
        char myUnicode = '\u0041';
        System.out.println(myHex);
        System.out.println(myUnicode);
        System.out.println(myOctal);
        System.out.println(myBinary);
        System.out.println(myByte);
        System.out.println(myShort);
        System.out.println(myInt);
        System.out.println(myLong);
        System.out.println(myFloat);
        System.out.println(myDouble);
        System.out.println(myBoolean);
        System.out.println(myChar);
        // multiples variables de un mismo tipo puede ser inicializadas simultaneamente
        int myBigNumOne = 1231231233, myBigNumTwo = 234232342;
        // Se puede incializar sin darle valor
        int myBigNumWithoutValue;

        // float e =1.2 no se puede ya que se considera sin la F al final double
        //los Char se declaran con comilla simple
        // boolean h = "true"; no se puede
        // boolean i = 'false'; no se puede
        // boolean j = 0 no se puede;
        // boolean k = False no se puede
        int a = 10, b = 1000;
        System.out.println(a%b);
        System.out.println(a%=b);
        System.out.println(a/=b);
        System.out.println((a+b)*a);
        System.out.println(a++);
        System.out.println(++a);
        System.out.println(a--);
        System.out.println(--a);
        int c;
        // El operador de incremento de sufijo
        // significa que la expresión se evalúa
        // primero utilizando el valor original
        // de la variable y luego la variable se incrementa
        c=a++;
        System.out.println(String.format("a: %s", a));
        System.out.println(String.format("c: %s",c));
        // El operador de incremento de prefijo significa
        // que la variable se incrementa primero y luego
        // la expresión se evalúa utilizando el
        // nuevo valor de la variabl
        c=++a;
        System.out.println(String.format("a: %s", a));
        System.out.println(String.format("c: %s",c));
        c=a--;
        System.out.println(String.format("a: %s", a));
        System.out.println(String.format("c: %s",c));
        c=--a;
        System.out.println(String.format("a: %s", a));
        System.out.println(String.format("c: %s",c));

    }
}
