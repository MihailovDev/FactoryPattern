package com.example.factorypattern.simplefactoryimpl;

import android.util.Log;

/**
 * An abstract superclass that all Pizzas inherit from.
 * This is the product of the factory.
 */
public abstract class Pizza {
    private static final String TAG = Pizza.class.getName();
    void prepare(){
        Log.i(TAG, "prepare: The pizza is being prepared");
    }
    void cut(){
        Log.i(TAG, "cut: The pizza is being cut");
    }
}
