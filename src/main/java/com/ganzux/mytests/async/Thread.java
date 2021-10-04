package com.ganzux.mytests.async;

public class Thread {

    public static void main(String[] args) {
        int number = 20;

        java.lang.Thread thread = new java.lang.Thread(() -> {
            System.out.println("Factorial of " + number + " is " + factorial(number));
        });

        thread.start();

        System.out.println("End.");
    }

    protected static long factorial(int numer) {
        if (numer < 3) {
            return  numer;
        }

        return numer * factorial(numer - 1);
    }

}
