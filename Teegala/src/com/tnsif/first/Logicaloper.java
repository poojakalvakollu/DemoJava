package com.tnsif.first;

public class Logicaloper {
	public static void main(String[] args) {
        int a = 15, b = 5;
        System.out.println("(a > 10 && b < 10) → " + (a > 10 && b < 10));
        System.out.println("(a < 10 || b < 10) → " + (a < 10 || b < 10));
        System.out.println("!(a > b) → " + (!(a > b)));
    }

}
