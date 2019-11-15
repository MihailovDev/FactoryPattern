package com.example.factorypattern.abstractfactoryimpl;

import com.example.factorypattern.abstractfactoryimpl.generic.Cheese;
import com.example.factorypattern.abstractfactoryimpl.generic.Clam;
import com.example.factorypattern.abstractfactoryimpl.generic.Dough;
import com.example.factorypattern.abstractfactoryimpl.generic.Sauce;

/**
 * This factory provides an interface for creating a family of products (related or dependent objects).
 * By using this interface, we decouple our code from the actual factory that
 * creates the products. This allows for implementation of variety of factories
 * that produce products meant for different contexts.
 */
public interface PizzaIngredientFactory {
    public Dough createDough();
    public Sauce createSauce();
    public Cheese createCheese();
    public Clam createClam();
}
