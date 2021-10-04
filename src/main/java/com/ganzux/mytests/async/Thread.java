package com.ganzux.mytests.async;

public class Thread {

    public static void main(String[] args) {
        int number = 20;

        java.lang.Thread thread = new java.lang.Thread(() -> {
            System.out.println("Factorial of " + number + " is " + MyMath.factorial(number));
        });

        thread.start();

        System.out.println("End.");
    }

}
