package com.example.factorypattern.abstractfactoryimpl;


import com.example.factorypattern.abstractfactoryimpl.generic.Pizza1;

public class ClamPizzaAbs extends Pizza1 {
    PizzaIngredientFactory ingredientFactory;

    public ClamPizzaAbs(PizzaIngredientFactory ingredientFactory) {
        this.ingredientFactory = ingredientFactory;
    }
    public void prepare() {
        System.out.println("Preparing " + name);
        dough = ingredientFactory.createDough();
        sauce = ingredientFactory.createSauce();
        cheese = ingredientFactory.createCheese();
        clam = ingredientFactory.createClam();
    }
}