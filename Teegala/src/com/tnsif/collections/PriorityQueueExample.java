package com.tnsif.collections;

import java.util.PriorityQueue;

public class PriorityQueueExample {
    public static void main(String[] args) {
        PriorityQueue<Integer> numbers = new PriorityQueue<>();
        numbers.add(30);
        numbers.add(10);
        numbers.add(50);
        numbers.add(20);

        System.out.println(numbers);
        System.out.println("Head: " + numbers.peek());
        numbers.remove();
        System.out.println("After removing head: " + numbers);
        System.out.println("Size: " + numbers.size());
    }
}
