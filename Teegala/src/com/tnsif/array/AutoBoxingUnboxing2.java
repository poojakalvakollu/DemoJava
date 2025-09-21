package com.tnsif.array;

public class AutoBoxingUnboxing2 {

	public static void main(String[] args) {
		 double d = 99.99;         
	        Double obj = d;            
	        System.out.println("Autoboxing (double → Double): " + obj);

	        double e = obj;            
	        System.out.println("Unboxing (Double → double): " + e);

	}

}
