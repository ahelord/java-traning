package com.ahelord.colecciones;

import com.ahelord.clases.Product;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Set;
import java.util.List;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        Product beer = new Product(12,"Beer");
        Product cake = new Product(15,"cake");
        List<Product> products = new ArrayList<>(5);
        products.add(beer);
        products.add(cake);
        System.out.println(products);
        List<Product> productsTwo = List.of(beer,cake);
        System.out.println(productsTwo);
        List<Product> productsThree = Arrays.asList(beer,cake);
        System.out.println(productsThree);
        Set<Product> productsUnique = new HashSet<>(5);
        productsUnique.add(beer);
        productsUnique.add(cake);
        System.out.println(productsUnique);
        List<Product> productsFour = new ArrayList<>(productsUnique);
        System.out.println(productsFour);
        // Manejando datos en colecciones
        products.add(0,null);
        products.set(0,beer);
        System.out.println(products.indexOf(beer));
        products.remove(beer);
        products.remove(0);
        for (Product product:products) {
            System.out.println(product.getName());
        }
        boolean hasBeer = products.contains(beer);
        System.out.println(hasBeer);
        System.out.println(products.get(0).getName());


     }
}
