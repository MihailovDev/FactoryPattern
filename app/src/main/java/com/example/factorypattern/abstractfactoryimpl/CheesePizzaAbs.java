package com.example.factorypattern.abstractfactoryimpl;

import android.util.Log;

import com.example.factorypattern.abstractfactoryimpl.generic.Pizza1;

public class CheesePizzaAbs extends Pizza1 {
    private final static String TAG = CheesePizzaAbs.class.getName();

    PizzaIngredientFactory ingredientFactory;
    public CheesePizzaAbs(PizzaIngredientFactory ingredientFactory) {
        this.ingredientFactory = ingredientFactory;
    }
    public void prepare() {
        Log.i(TAG, "Preparing " + name);
        dough = ingredientFactory.createDough();
        sauce = ingredientFactory.createSauce();
        cheese = ingredientFactory.createCheese();
    }
}
