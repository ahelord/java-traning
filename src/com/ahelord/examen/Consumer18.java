package com.ahelord.examen;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class Consumer18 {
    public static void main(String[] args) {
/*
        BiConsumer<String, String> biCon2 = (final var x, y) -> System.out.println(x+y);
*/

/*        Consumer<String> con2 = final var x -> System.out.print(x);*/

        BiConsumer<String, String> biCon1 = (final var x, final var y) -> System.out.println(x+y);
        // correct


/*        Consumer<String> con1 = final String x -> System.out.print(x);*/
/*
        Consumer<String> con3 = final x -> System.out.print(x);
*/

        BiConsumer<String, String> biCon3 = (final var x, var y) -> System.out.println(x+y);
    }
}
