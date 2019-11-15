package com.example.factorypattern.abstractfactoryimpl.chicagoingredients;

import com.example.factorypattern.abstractfactoryimpl.generic.Cheese;
import com.example.factorypattern.abstractfactoryimpl.generic.Clam;
import com.example.factorypattern.abstractfactoryimpl.generic.Dough;
import com.example.factorypattern.abstractfactoryimpl.PizzaIngredientFactory;
import com.example.factorypattern.abstractfactoryimpl.generic.Sauce;

public class ChicagoIngredientFactory implements PizzaIngredientFactory {
    @Override
    public Dough createDough() {
        return new ThickCrustDough();
    }

    @Override
    public Sauce createSauce() {
        return new TomatoSauce();
    }

    @Override
    public Cheese createCheese() {
        return new MozzarelaCheese();
    }

    @Override
    public Clam createClam() {
        return new FreshClam();
    }
}
