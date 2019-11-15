package com.example.factorypattern.abstractfactoryimpl.generic;

import android.util.Log;

/**
 * An abstract superclass that all Pizzas inherit from.
 * This is the product of the factory.
 */
public abstract class Pizza1 {

    private final static String TAG = Pizza1.class.getName();
    public String name;
    public Dough dough;
    public Cheese cheese;
    public Sauce sauce;
    public Clam clam;

    public abstract void prepare();


    public void cut() {
        Log.i(TAG, "Cutting the pizza into diagonal slices");
    }

    public void box() {
        Log.i(TAG, "Place pizza in official PizzaStore box");
    }

    public void setName(String name) {
        this.name = name;
    }

    String getName() {
        return name;
    }

}
