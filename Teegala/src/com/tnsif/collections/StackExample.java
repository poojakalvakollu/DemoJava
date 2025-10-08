package com.tnsif.collections;

import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        stack.push("Red");
        stack.push("Green");
        stack.push("Blue");
        stack.push("Yellow");

        System.out.println("Stack: " + stack);
        System.out.println("Top element: " + stack.peek());
        stack.pop();
        System.out.println("After pop: " + stack);
        System.out.println("Is stack empty? " + stack.isEmpty());
        System.out.println("Position of Green: " + stack.search("Green"));
    }
}

