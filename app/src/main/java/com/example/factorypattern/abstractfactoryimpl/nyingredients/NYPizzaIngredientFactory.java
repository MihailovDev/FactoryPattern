package com.example.factorypattern.abstractfactoryimpl.nyingredients;

import com.example.factorypattern.abstractfactoryimpl.generic.Cheese;
import com.example.factorypattern.abstractfactoryimpl.generic.Clam;
import com.example.factorypattern.abstractfactoryimpl.generic.Dough;
import com.example.factorypattern.abstractfactoryimpl.PizzaIngredientFactory;
import com.example.factorypattern.abstractfactoryimpl.generic.Sauce;

public class NYPizzaIngredientFactory implements PizzaIngredientFactory {
    @Override
    public Dough createDough() {
        return new ThinCrustDough();
    }

    @Override
    public Sauce createSauce() {
        return new RedSauce();
    }

    @Override
    public Cheese createCheese() {
        return new ReggianoCheese();
    }

    @Override
    public Clam createClam() {
        return new FrozenClam();
    }
}
