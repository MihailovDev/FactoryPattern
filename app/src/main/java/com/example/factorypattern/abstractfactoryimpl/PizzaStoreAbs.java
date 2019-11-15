package com.example.factorypattern.abstractfactoryimpl;

import com.example.factorypattern.abstractfactoryimpl.generic.Pizza1;
import com.example.factorypattern.factorymethodimpl.MethodPizza;
import com.example.factorypattern.simplefactoryimpl.Pizza;
import com.example.factorypattern.simplefactoryimpl.SimplePizzaFactory;

/**
 * This is the client of the factory. It uses SimplePizzaFactory
 * to get instances of pizza.
 */
public abstract class PizzaStoreAbs {

    public final Pizza1 orderPizza(String type) {
        Pizza1 pizza1;
        pizza1 = createPizza(type);
        pizza1.prepare();
        pizza1.cut();
        pizza1.box();
        return pizza1;
    }

    protected abstract Pizza1 createPizza(String type);
}
