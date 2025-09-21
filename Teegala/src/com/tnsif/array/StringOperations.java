package com.tnsif.array;

public class StringOperations {

	public static void main(String[] args) {
		 String s = "Hello";
	        s = s.concat(" World");
	        System.out.println("String: " + s);

	        StringBuffer sb = new StringBuffer("Hello");
	        sb.append(" World");
	        System.out.println("StringBuffer: " + sb);

	        StringBuilder sbl = new StringBuilder("Hello");
	        sbl.append(" World");
	        System.out.println("StringBuilder: " + sbl);

	        System.out.println("Length of String: " + s.length());
	        System.out.println("Reverse of StringBuffer: " + sb.reverse());
	        System.out.println("Insert in StringBuilder: " + sbl.insert(5, " Java"));

	}

}
