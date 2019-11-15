package com.example.factorypattern.factorymethodimpl;

import android.util.Log;

import java.util.ArrayList;

/**
 * This is the product of the factory. It's an abstract class that implements the common
 * code and delegates the concrete implementation to concrete subclasses.
 */
public abstract class MethodPizza {
    public String name;
    public String dough;
    public String sauce;
    public ArrayList<String> toppings = new ArrayList();

    private static final String TAG = MethodPizza.class.getName();

    void prepare() {
        Log.i(TAG, "Preparing " + name);
        Log.i(TAG, "Tossing dough...");
        Log.i(TAG, "Adding sauce...");
        Log.i(TAG, "Adding toppings: ");
        for (int i = 0; i < toppings.size(); i++) {
            Log.i(TAG, " " + toppings.get(i));
        }
    }

    void cut() {
        Log.i(TAG, "cut: The pizza is being cut");
    }

}
