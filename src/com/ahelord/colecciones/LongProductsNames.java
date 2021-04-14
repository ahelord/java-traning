package com.ahelord.colecciones;

import com.ahelord.clases.Product;

import java.util.function.Predicate;

public class LongProductsNames implements Predicate<Product> {
    public boolean test(Product product) {
        return product.getName().length() > 4;
    }
}

