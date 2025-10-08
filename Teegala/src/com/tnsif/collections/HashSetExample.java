package com.tnsif.collections;

import java.util.HashSet;

public class HashSetExample {
    public static void main(String[] args) {
        HashSet<String> cities = new HashSet<>();
        cities.add("Hyderabad");
        cities.add("Chennai");
        cities.add("Delhi");
        cities.add("Mumbai");
        cities.add("Hyderabad");

        System.out.println("Cities: " + cities);
        System.out.println("Contains Delhi? " + cities.contains("Delhi"));
        cities.remove("Chennai");
        System.out.println("After removing Chennai: " + cities);
        System.out.println("Total cities: " + cities.size());
        cities.clear();
        System.out.println("After clearing: " + cities);
    }
}

