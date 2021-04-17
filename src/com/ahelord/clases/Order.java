package com.ahelord.clases;

import java.util.List;
import java.util.stream.Stream;

public class Order {

    public Stream<Product> getProductsStream() {
        return productsStream;
    }

    public void setProductsStream(Stream<Product> productsStream) {
        this.productsStream = productsStream;
    }

    private Stream<Product> productsStream;

}
