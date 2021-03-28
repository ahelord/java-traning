package com.ahelord.precision;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Main {
    public static void main(String[] args) {
        BigDecimal price = BigDecimal.valueOf(12.99);
        BigDecimal taxRate = BigDecimal.valueOf(0.2);
        BigDecimal tax = price.multiply(taxRate);
        System.out.println(tax);
        price = price.add(tax).setScale(2, RoundingMode.HALF_UP);
        System.out.println(price);


    }
}
