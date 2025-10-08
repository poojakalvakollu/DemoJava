package com.tnsif.collections;

import java.util.LinkedHashSet;

public class LinkedHashSetExample {
    public static void main(String[] args) {
        LinkedHashSet<String> fruits = new LinkedHashSet<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
        fruits.add("Mango");
        fruits.add("Apple");

        System.out.println("Fruits: " + fruits);
        System.out.println("Contains Mango? " + fruits.contains("Mango"));
        fruits.remove("Orange");
        System.out.println("After removing Orange: " + fruits);
        System.out.println("Total fruits: " + fruits.size());
        fruits.clear();
        System.out.println("After clearing: " + fruits);
    }
}
