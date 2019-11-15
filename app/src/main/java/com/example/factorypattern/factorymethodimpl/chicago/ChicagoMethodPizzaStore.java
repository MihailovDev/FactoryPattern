package com.example.factorypattern.factorymethodimpl.chicago;

import com.example.factorypattern.factorymethodimpl.MethodPizza;
import com.example.factorypattern.factorymethodimpl.MethodPizzaStore;

/**
 * This is the concrete implementation of the creator class, this is a creator class.
 * It overrides the abstract factory method and creates it's own products.
 */
public class ChicagoMethodPizzaStore extends MethodPizzaStore {
    @Override
    public MethodPizza createPizza(String type) {
        if (type.equals("veggie")) {
            return new ChicagoVeggieMethodPizza();
        } else if (type.equals("mediteranian")) {
           return new ChicagoMediteranianMethodPizza();
        }else {
            return null;
        }
    }
}
