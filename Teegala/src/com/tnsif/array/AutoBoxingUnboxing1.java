package com.tnsif.array;

public class AutoBoxingUnboxing1 {

	public static void main(String[] args) {
		int a = 50;                
        Integer obj = a;           
        System.out.println("Autoboxing (int → Integer): " + obj);

        int b = obj;               
        System.out.println("Unboxing (Integer → int): " + b);

	}

}
