package com.ahelord.colecciones;

import com.ahelord.clases.Product;

import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;

public class Main {
    public static void main(String[] args) {
        Product beer = new Product(12, "Beer");
        Product cake = new Product(15, "cake");
        Product pizza = new Product(15, "pizza");
        List<Product> products = new ArrayList<>(5);
        products.add(beer);
        products.add(cake);
        System.out.println(products);
        List<Product> productsTwo = List.of(beer, cake);
        System.out.println(productsTwo);
        List<Product> productsThree = Arrays.asList(beer, cake);
        System.out.println(productsThree);
        Set<Product> productsUnique = new HashSet<>(5);
        productsUnique.add(beer);
        productsUnique.add(cake);
        System.out.println(productsUnique);
        List<Product> productsFour = new ArrayList<>(productsUnique);
        System.out.println(productsFour);
        // Manejando datos en colecciones
        products.add(0, null);
        products.set(0, beer);
        System.out.println(products.indexOf(beer));
        products.remove(beer);
        products.remove(0);
        for (Product product : products) {
            System.out.println(product.getName());
        }
        boolean hasBeer = products.contains(beer);
        System.out.println(hasBeer);
        System.out.println(products.get(0).getName());
        // Sets
        Set<Product> productsUniqueTwo = new HashSet<>(5, 0.1F);
        productsUniqueTwo.add(beer);
        System.out.println("Add cake ? " + productsUniqueTwo.add(cake));
        System.out.println("Add cake ? " + productsUniqueTwo.add(cake));
        productsUniqueTwo.remove(beer);
        System.out.println(productsUniqueTwo.contains(beer));
        for (Product product : productsUniqueTwo) {
            System.out.println(product.getName());
        }
        // Deque
        Deque<Product> productsDeque = new ArrayDeque<>(20);
        System.out.println("an peek first " + productsDeque.peekFirst());
        productsDeque.offerFirst(beer);
        productsDeque.offerFirst(cake);
        System.out.println(productsDeque.peekFirst().getName());
        System.out.println(productsDeque.peekLast().getName());
        productsDeque.pollFirst();
        System.out.println(productsDeque.peekFirst().getName());
        productsDeque.pollLast();
        System.out.println(productsDeque.peekFirst());
        productsDeque.offerLast(cake);
        System.out.println(productsDeque.peekLast().getName());
        for (Product product:productsDeque ){
            System.out.println("product in deque "+product.getName());
        }
        //HashMap
        Map<Integer,Product> productsHashMap = new HashMap<>();
        productsHashMap.put(2,beer);
        productsHashMap.put(3,cake);
        System.out.println("Porduct hash in key 2 "+productsHashMap.get(2).getName());
        productsHashMap.put(5,beer);
        productsHashMap.remove(2);
        System.out.println("Containt key 2 ?"+productsHashMap.containsKey(2));
        System.out.println("Containt value beer ?"+productsHashMap.containsValue(beer));
        System.out.println("Containt value cake ?"+productsHashMap.containsValue(cake));
        System.out.println(productsHashMap);
        Set<Integer> keys = productsHashMap.keySet();
        Collection<Product> values = productsHashMap.values();
        for (Product product:values) {
            System.out.println("product in hashmap values "+product.getName());
        }
        for (Integer key:keys) {
            System.out.println("product key in hashmap "+key);
        }
        // Behaviors of collection
        List<Product> menu = new ArrayList<>();
        menu.add(beer);
        menu.add(cake);
        menu.add(pizza);
        menu.removeIf(new LongProductsNames());
        for (Product product:menu) {
            System.out.println("Behaviors 1 "+product.getName());
        }
        Collections.reverse(menu);
        for (Product product:menu) {
            System.out.println("Behaviors 2 "+product.getName());
        }
        Collections.shuffle(menu);
        Collections.fill(menu,new Product(12,"Chocolate"));
        for (Product product:menu) {
            System.out.println("Behaviors 3 "+product.getName());

        }
        Collections.sort(menu);


        // Prevenir que la memoria se corrompa y suministre un estado incorrecto
        // pueden ser sincronized list set
        Set<Product> readOnlySet = Collections.unmodifiableSet(productsUnique);  // unmodifiable
        Map<Integer,Product> syncMap = Collections.synchronizedMap(productsHashMap); // sincronized
        List<Product> copyOnWriteList = new CopyOnWriteArrayList<>(menu);  // copy on write

    }
}
