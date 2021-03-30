package com.ahelord.clases;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.time.Period;

public class Product {
    // constante compartida
    public static final double IVA = 0.16;
    //    private static Period defaultExpiryPeriod = Period.ofDays(3);
    private static Period defaultExpiryPeriod;
    private BigDecimal price;

    static {
        defaultExpiryPeriod = Period.ofDays(3);
    }

    private LocalDateTime bestBefore;

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(final BigDecimal price) {
        this.price = price;
    }

    public LocalDateTime getBestBefore() {
        return bestBefore;
    }

    public void setBestBefore(final LocalDateTime bestBefore) {
        this.bestBefore = bestBefore;
    }

    public BigDecimal getDiscount(final BigDecimal discount) {
        // los metodos estaticos no pertenecen a ninguna instancia

        return price.multiply(discount);
    }

    // los metodos y variables  estaticos no pertenecen a ninguna instancia
    // comparten todas las instancias podrian ser nmetodos por defecto que no dependan del objeto por
    // static es algo comun para los objetos es parecido a una constante que puede cambiar
    // ejemplo calcular la velocidad de un objeto teniendo en cuanta su propia masa
    public static Period setDefaultExpiryPeriod(final int days) {
        // no puedo acceder a una variable o metodo de instancia
        // this
        defaultExpiryPeriod = Period.ofDays(days);
        return defaultExpiryPeriod;
    }
}
