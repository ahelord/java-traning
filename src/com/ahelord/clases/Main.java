package com.ahelord.clases;

import static com.ahelord.clases.Stat.random;
import java.math.BigDecimal;
import java.time.LocalDateTime;


public class Main {
    public static void main(String[] args) {
        System.out.println(random());
        System.out.println(Product.IVA);
        Product myProduct = new Product();
        System.out.println(myProduct.countCreations);
        myProduct.setPrice(new BigDecimal(100.212));
        System.out.println(myProduct.getDiscount(new BigDecimal(0.2)));
        System.out.println(myProduct.setDefaultExpiryPeriod(2));
        Product myProductTwo = new Product();
        System.out.println(myProductTwo.setDefaultExpiryPeriod(2));
        System.out.println(Product.setDefaultExpiryPeriod(1));
        System.out.println(myProduct.IVA);
        myProduct.setPrice(12.00);
        System.out.println(myProduct.getPrice());
       myProduct.printVarArg("first","a","b","c");
        System.out.println(myProductTwo.countCreations);
        Product myProductThree = new Product("coffe", 12, BigDecimal.valueOf(12.2), LocalDateTime.now());
        System.out.println(myProductThree.getProductStatus().getMessage());

    }
}
