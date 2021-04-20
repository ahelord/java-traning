package com.ahelord.examen;

 interface TestInterface {
    public abstract double calculateTax();
}

/*
 class testClass implements TestInterface {
    public abstract double calculateTax();
}
*/

 abstract class testClass implements TestInterface {
    public double calculateTax(double tax){
        return 0.0;
    }
}

 class testClass1 {
    public double calculateTax(){
      return  0.0;
    }
}


