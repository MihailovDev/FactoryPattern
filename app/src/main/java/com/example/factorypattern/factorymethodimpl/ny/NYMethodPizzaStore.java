package com.example.factorypattern.factorymethodimpl.ny;

import com.example.factorypattern.factorymethodimpl.MethodPizza;
import com.example.factorypattern.factorymethodimpl.MethodPizzaStore;

/**
 * This is the concrete implementation of the creator class, this is a creator class.
 * It overrides the abstract factory method and creates it's own products.
 */
public class NYMethodPizzaStore extends MethodPizzaStore {
    @Override
    public MethodPizza createPizza(String type) {
        MethodPizza methodPizza = null;
        if (type.equals("cheese")) {
            methodPizza = new NYCheesePizza();
        } else if (type.equals("mediteranian")) {
            methodPizza = new NYMediteranianMethodPizza();
        }
        return methodPizza;
    }
}
