package com.tnsif.multithreading;

public class MyThread extends Thread  {
	public void run() {
        for (int i = 1; i <= 3; i++) {
            System.out.println("Child Thread: " + i);
            try {
                Thread.sleep(500); // pause for half a second
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}
