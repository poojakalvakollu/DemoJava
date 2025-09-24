package com.tnsif.multithreading;

public class JoinExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 MyThread t1 = new MyThread();
	        t1.start();

	        try {
	            // Main thread waits until t1 finishes
	            t1.join();
	        } catch (InterruptedException e) {
	            e.printStackTrace();
	        }

	        System.out.println("Main Thread continues after child thread is done.");

	}

}
