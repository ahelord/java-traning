package com.ahelord.examen;

import java.math.BigDecimal;
import java.util.function.Function;
import java.util.function.Supplier;

class Planet {
    private BigDecimal milesFromSun;
    public Planet(String milesFromSun){
        this.milesFromSun = new BigDecimal(milesFromSun);
    }
    public BigDecimal getMilesFromSun(){
        return milesFromSun;
    }
    public static BigDecimal milesToKilometers(BigDecimal miles){
        BigDecimal scale = new BigDecimal("1.60934");
        return miles.multiply(scale);
    }
     public static void main(String[] args) {
         Planet earth = new Planet("93000000");
         //line n1
         //Function<Planet, BigDecimal> lambda = Planet::milesToKilometers;
         //Supplier<BigDecimal> lambda = ()::milesToKilometers(earth.getMilesFromSun())
         //Function<BigDecimal, BigDecimal> lambda = earth.getMilesFromSun()::milesToKilometers

         //Function<Planet, BigDecimal> lambda = earth::milesToKilometers;
        // CORRECT
    }
 }
