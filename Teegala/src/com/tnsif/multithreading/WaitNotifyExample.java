
package com.tnsif.multithreading;

class SharedResource {
    private boolean available = false;

    public synchronized void produce() {
        try {
            while (available) {
                wait();
            }
            System.out.println("Produced an item");
            available = true;
            notify();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public synchronized void consume() {
        try {
            while (!available) {
                wait();
            }
            System.out.println(Thread.currentThread().getName() + " consumed an item");
            available = false;
            notifyAll();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

public class WaitNotifyExample {
    public static void main(String[] args) {
        SharedResource resource = new SharedResource();

        Thread producer = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                resource.produce();
                try { Thread.sleep(500); } catch (InterruptedException e) {}
            }
        });

        Thread consumer1 = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                resource.consume();
                try { Thread.sleep(1000); } catch (InterruptedException e) {}
            }
        }, "Consumer-1");

        Thread consumer2 = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                resource.consume();
                try { Thread.sleep(1000); } catch (InterruptedException e) {}
            }
        }, "Consumer-2");

        producer.start();
        consumer1.start();
        consumer2.start();
    }
}
