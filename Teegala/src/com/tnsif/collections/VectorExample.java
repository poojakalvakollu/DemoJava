package com.tnsif.collections;

import java.util.Vector;

public class VectorExample {
    public static void main(String[] args) {
        Vector<String> v = new Vector<>();
        v.add("A");
        v.add("B");
        v.add("C");
        v.add("D");
        System.out.println(v);
        v.remove("C");
        System.out.println(v);
        System.out.println(v.size());
    }
}
