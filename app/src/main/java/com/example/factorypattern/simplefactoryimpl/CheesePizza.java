package com.example.factorypattern.simplefactoryimpl;

import android.util.Log;

/**
 * Concrete implementation of MethodPizza.
 */
public class CheesePizza extends Pizza {
    private final static String TAG = CheesePizza.class.getName();

    CheesePizza() {
        Log.i(TAG, "CheesePizzaAbs: cheese pizza");
    }
}
