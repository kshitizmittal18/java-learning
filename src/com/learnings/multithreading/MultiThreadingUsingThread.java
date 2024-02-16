package com.learnings.multithreading;

class MultiThreadingDemoUsingThread extends Thread {
    public void run() {
        try {
            // Displaying the thread that is running
            System.out.println("Thread "+Thread.currentThread().getId()+" is running");
        } catch (Exception e) {
            System.out.println("Exception caught");
        }
    }
}

public class MultiThreadingUsingThread {
    public static void main(String[] args) {
        int n = 10;
        for (int i = 0; i < n; i++) {
            MultiThreadingDemoUsingThread mt = new MultiThreadingDemoUsingThread();
            mt.start();
        }

    }
}
