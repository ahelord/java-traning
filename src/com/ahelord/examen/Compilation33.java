package com.ahelord.examen;

import java.util.function.BiFunction;
import java.util.function.DoubleFunction;
import java.util.function.DoublePredicate;
import java.util.function.IntPredicate;

public class Compilation33 {
    public static void main(String[] args) {
       /* DoublePredicate<Integer, Integer> test = (x, y) -> x == y;*/

        IntPredicate test2 = x -> x == 10;

        BiFunction<Integer, Integer, Integer> divide = (x, y) -> x/y;

        DoubleFunction<Double> area = r -> Math.PI*r*r;
    }
}
