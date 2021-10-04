package com.ganzux.mytests.async;

public abstract class MyMath {

    protected static long factorial(int numer) {
        if (numer < 3) {
            return  numer;
        }

        return numer * factorial(numer - 1);
    }
}
