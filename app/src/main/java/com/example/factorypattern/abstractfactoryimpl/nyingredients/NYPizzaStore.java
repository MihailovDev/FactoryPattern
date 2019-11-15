package com.example.factorypattern.abstractfactoryimpl.nyingredients;

import com.example.factorypattern.abstractfactoryimpl.CheesePizzaAbs;
import com.example.factorypattern.abstractfactoryimpl.ClamPizzaAbs;
import com.example.factorypattern.abstractfactoryimpl.PizzaStoreAbs;
import com.example.factorypattern.abstractfactoryimpl.generic.Pizza1;
import com.example.factorypattern.abstractfactoryimpl.PizzaIngredientFactory;

public class NYPizzaStore extends PizzaStoreAbs {

    protected Pizza1 createPizza(String item) {
        Pizza1 pizza = null;

        PizzaIngredientFactory ingredientFactory = new NYPizzaIngredientFactory();

        if (item.equals("cheese")) {
            pizza = new CheesePizzaAbs(ingredientFactory);
            pizza.setName("New York Style Cheese Pizza");
        } else if (item.equals("clam")) {
            pizza = new ClamPizzaAbs(ingredientFactory);
            pizza.setName("New York Style Clam Pizza");
        }
        return pizza;
    }
}
