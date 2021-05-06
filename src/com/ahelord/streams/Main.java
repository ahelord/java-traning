package com.ahelord.streams;

import com.ahelord.clases.Order;
import com.ahelord.clases.Product;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.*;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.ToIntFunction;
import java.util.function.UnaryOperator;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        List<Product> list = new ArrayList<>();
        list.add(new Product(12, "Cake"));
        list.add(new Product(14, "Beer"));
        list.add(new Product(9, "Chocolate"));
        list.add(new Product(1, "Butter"));
        list.add(new Product(2, "Milk"));
        list.add(new Product(4, "Sprite"));
        list.add(new Product(20, "7up"));

        list.stream()
                .parallel()
                .filter(product -> product.getName().equals("Cake"))
                .forEach(product -> product.setBestBefore(LocalDateTime.now()));
        for (Product product : list) {
            System.out.println(product.getBestBefore());
        }
        // IntStream.generate(() -> (int) (Math.random()) * 10).takeWhile(value -> value != 3).sum();

        // Filter
        list.stream().filter(Predicate.isEqual(new Product(12, "Beer")));
        list.stream().filter(product -> product.getAmount() > 10);
        // Map
        Function<Product, String> nameMapper = product -> product.getName();
        UnaryOperator<String> trimMapper = s -> s.trim();
        ToIntFunction<String> lengthMapper = value -> value.length();

        list.stream().map(product -> product.getName()).forEach(s -> System.out.println(s));
        // flatmap
        List<Order> orders = new ArrayList<>();
        Order myOrder = new Order();
        myOrder.setProductsStream(list.stream());
        orders.add(myOrder);
        Double sum = orders.stream().flatMap(order -> order.getProductsStream()).mapToDouble(value -> value.getAmount()).sum();
        System.out.println(sum);

        // average
        List<Order> ordersTwo = new ArrayList<>();
        Order myOrderTwo = new Order();
        myOrderTwo.setProductsStream(list.stream());
        ordersTwo.add(myOrderTwo);
        OptionalDouble average = ordersTwo.stream().flatMap(order -> order.getProductsStream()).mapToDouble(value -> value.getAmount()).average();
        System.out.println(average.isPresent() ? average.getAsDouble() : 0);
        // Reduce
        Optional<String> souts = list.stream().map(nameMapper).reduce((s, s2) -> s+"reduce"+s2);
        System.out.println(souts.isPresent()?souts.get():"no data");

        // Collectors
        DoubleSummaryStatistics stats = list.stream().collect(Collectors.summarizingDouble(value -> value.getAmount()));
        System.out.println(stats.getCount());
        System.out.println(stats.getMax());
        System.out.println(stats.getMin());
        System.out.println(stats.getAverage());

        //Parallel
        List<Order> ordersThree= new ArrayList<>();
        Order myOrderThree = new Order();
        myOrderThree.setProductsStream(list.stream());
        ordersThree.add(myOrderThree);
        Double sumThree = ordersThree.stream().parallel().flatMap(order -> order.getProductsStream()).mapToDouble(value -> value.getAmount()).sum();
        System.out.println("Sum paralelo "+sumThree);


    }
}
