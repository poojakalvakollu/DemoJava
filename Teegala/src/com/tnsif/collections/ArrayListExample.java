package com.tnsif.collections;

import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<Object> list = new ArrayList<>();
        list.add(25);
        list.add("Chennai");
        list.add(44);
        list.add("Hyderabad");
        list.add("Delhi");
        list.remove(4);

        System.out.println(list.contains("Hyderabad"));
        System.out.println(list.size());
        System.out.println(list);
        System.out.println(list.removeAll(list));
    }
}
