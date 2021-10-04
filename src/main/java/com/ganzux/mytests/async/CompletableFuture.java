package com.ganzux.mytests.async;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CompletableFuture {

    public static void main(String[] args) throws Exception {

        int number = 20;

        java.util.concurrent.CompletableFuture<Long> completableFuture =
                java.util.concurrent.CompletableFuture.supplyAsync(() -> MyMath.factorial(number));

        while(!completableFuture.isDone()) {
            System.out.println("I am still calculating the factorial...");
        }

        long result = completableFuture.get();

        System.out.println("Factorial of " + number + " is " + result);

    }
}
