package com.ahelord.clases;

import static com.ahelord.clases.Stat.random;
import java.math.BigDecimal;


public class Main {
    public static void main(String[] args) {
        System.out.println(random());
        System.out.println(Product.IVA);
        Product myProduct = new Product();
        myProduct.setPrice(new BigDecimal(100.212));
        System.out.println(myProduct.getDiscount(new BigDecimal(0.2)));
        System.out.println(myProduct.setDefaultExpiryPeriod(2));
        Product myProductTwo = new Product();
        System.out.println(myProductTwo.setDefaultExpiryPeriod(2));
        System.out.println(Product.setDefaultExpiryPeriod(1));
        System.out.println(myProduct.IVA);

    }
}
