package com.ganzux.mytests.async;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class FutureTask {

    public static void main(String[] args) throws Exception {

        int number = 20;

        ExecutorService threadPool = Executors.newCachedThreadPool();

        Future<Long> futureTask = threadPool.submit(() -> MyMath.factorial(number));

        while(!futureTask.isDone()) {
            System.out.println("I am still calculating the factorial...");
        }

        long result = futureTask.get();

        System.out.println("Factorial of " + number + " is " + result);

        threadPool.shutdown();
    }

}
