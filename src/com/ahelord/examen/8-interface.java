package com.ahelord.examen;

 interface Black {
    default void getColor(){
        System.out.print("Black");
    }
}
 interface Red extends Black {
    default void getColor(){
        System.out.print("Red");
    }
}
 interface Gold {
    static void getColor(){
        System.out.print("Gold");
    }
}
 class Colors implements Black, Red, Gold {
    public static void main(String[] args) {
        // What is the result of running this code?
        Colors colors = new Colors();
        colors.getColor();
    }
}
