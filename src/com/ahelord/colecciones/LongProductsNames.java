package com.ahelord.colecciones;

import com.ahelord.clases.Product;

import java.util.function.Predicate;
import java.util.function.Consumer;
import java.util.function.Function;
public class LongProductsNames implements Predicate<Product> {
    public boolean test(Product product) {
        return product.getName().length() > 4;
    }
}

