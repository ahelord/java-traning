package com.ahelord.examen;

/* abstract class testClass {
    double taxRate = 0.05;
    abstract void increaseTax(){
        taxRate = taxRate + 0.01;
    }
}*/

 interface TestInterface2 {
    static double taxRate = 0.05;
    abstract void increaseTax();
}

 interface TestInterface3 {
    double taxRate = 0.05;
    void increaseTax();
}

 abstract class testClass4 {
    double taxRate = 0.05;
    public void increaseTax() {
        taxRate = taxRate + 0.01;
    }
}

/* interface TestInterface5 {
    double taxRate = 0.05;
    default void increaseTax() {
        taxRate = taxRate + 0.01;
    }*/
