package com.learnings.callableAndFuture;

import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

public class CallableAndFuture implements Callable {
    @Override
    public Object call() throws Exception {
        System.out.println("call() called");
        Random generator = new Random();
        int randomNumber = generator.nextInt(5);

        Thread.sleep(randomNumber*1000);

        return randomNumber;
    }
}

class CallableAndFutureTest{
    public static void main(String[] args) throws Exception{
        FutureTask[] randomNumberTasks = new FutureTask[5];

        for (int i = 0; i < 5; i++) {
            Callable callable = new CallableAndFuture();

            randomNumberTasks[i] = new FutureTask(callable);

            Thread t = new Thread(randomNumberTasks[i]);
            t.start();
        }

        for (int i = 0; i < 5; i++) {
            System.out.println(randomNumberTasks[i].get());
        }
    }
}
