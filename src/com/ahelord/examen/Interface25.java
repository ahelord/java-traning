package com.ahelord.examen;

 interface InterfaceOne {
    int field = 99;
    default void method() {
        System.out.print(field);
    }
}
 interface InterfaceTwo {
    int field = 1983;
    private void method() {
        System.out.print(field);
    }
}
 class TheConcrete implements InterfaceOne, InterfaceTwo {
    public static void main(String[] args) {
        //Prints: 99 (Correct)
        TheConcrete theInstance = new TheConcrete();
        theInstance.method();
    }
}
