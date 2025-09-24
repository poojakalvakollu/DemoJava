package com.tnsif.multithreading;

public class PalindromeTracing {
	 public static void main(String[] args) {
	        String str = "madam"; // you can change this
	        int left = 0;
	        int right = str.length() - 1;
	        boolean isPalindrome = true;

	        while (left < right) {
	            System.out.println("Comparing: " + str.charAt(left) + " and " + str.charAt(right));
	            if (str.charAt(left) != str.charAt(right)) {
	                isPalindrome = false;
	                break;
	            }
	            left++;
	            right--;
	        }

	        if (isPalindrome) {
	            System.out.println(str + " is a palindrome.");
	        } else {
	            System.out.println(str + " is not a palindrome.");
	        }
	    }

}
