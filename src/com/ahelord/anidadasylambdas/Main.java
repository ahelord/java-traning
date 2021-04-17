package com.ahelord.anidadasylambdas;

import com.ahelord.clases.Product;
import com.ahelord.interfaces.Adoption;

import java.awt.*;
import java.math.BigDecimal;
import java.text.CollationElementIterator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Outer.StaticNested myNested = new Outer.StaticNested();
        myNested.getNow();
        Product product = new Product() {
            @Override
            public BigDecimal getDiscount(final BigDecimal discount) {
                // los metodos estaticos no pertenecen a ninguna instancia

                return discount;
            }

        };
        System.out.println(product.getDiscount(BigDecimal.valueOf(12)));

        Adoption adoption = new Adoption() {
            @Override
            public boolean canBeAdopted(Object animal) {
                return false;
            }
        };
        System.out.println(adoption.canBeAdopted(product));
        // anonymous inner classes and functional interfaces
        List<Product> menu = new ArrayList<>();
        menu.add(new Product(12,"Coffe"));
        menu.add(new Product(11,"Tea"));
        Collections.sort(menu, new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });
        // expresiones lambda
        Collections.sort(menu, (o1, o2) -> o1.getName().compareTo(o2.getName()));
        List<String> list = new ArrayList<>();
        list.removeIf((final var s)-> s.equals("remove me"));
        // se coloca el contexto por que hace falta Comparator<String>
        Comparator<String> sortText = (s1,s2) -> s1.compareTo(s2);

        // referecias de metodos
        Comparator<String> sortTextTwo = String::compareTo;
        Collections.sort(list,String::compareToIgnoreCase);

        // Usando los metodos staticos  y por defecto en la interface comparator
        Collections.sort(list,sortText.thenComparing(sortTextTwo).reversed());

    }

}
