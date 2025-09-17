package com.tnsif.first;

public class PrimeorNot {

	public static void main(String[] args) {
		 int n = 7;   
		    boolean prime = true;

		    if(n <= 1) prime = false;
		    else {
		      for(int i=2; i<=n/2; i++) {
		        if(n % i == 0) {
		          prime = false;
		          break;
		        }
		      }
		    }

		    if(prime) System.out.println(n + " is Prime");
		    else System.out.println(n + " is Not Prime");


	}

}
