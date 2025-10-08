package com.tnsif.collections;
import java.util.*;

public class LinkedListExample {
    public static void main(String[] args) {
        LinkedList<String> animals = new LinkedList<>();
        animals.add("Dog");
        animals.add("Cat");
        animals.add("Cow");
        animals.addFirst("Elephant");

        System.out.println("LinkedList: " + animals);
    }
}
