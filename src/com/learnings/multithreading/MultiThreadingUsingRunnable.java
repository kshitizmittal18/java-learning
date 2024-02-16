package com.learnings.multithreading;

class MultiThreadingDemoUsingRunnable implements Runnable{
    public void run(){
        try {
            System.out.println("Thread "+Thread.currentThread().getId()+" is running");
        } catch (Exception e){
            System.out.println("Exception caught");
        }
    }
}
public class MultiThreadingUsingRunnable {
    public static void main(String[] args) {
        int n = 10;
        for (int i = 0; i < n; i++) {
            Thread mt = new Thread(new MultiThreadingDemoUsingRunnable());
            System.out.println("State of thread mt after creating it is : "+mt.getState());
            mt.start();
        }
    }
}
