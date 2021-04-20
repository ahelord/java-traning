package com.ahelord.examen;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Types40 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("hola");
        list.forEach( x -> { System.out.println(x); } );
    }
}
