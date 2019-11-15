package com.example.factorypattern.factorymethodimpl.ny;

import com.example.factorypattern.factorymethodimpl.MethodPizza;

/**
 * Concrete implementation of MethodPizza.
 */
public class NYCheesePizza extends MethodPizza {
    NYCheesePizza(){
        name = "NY Style Sauce and Cheese MethodPizza";
        dough = "dough = Thin Crust Dough";
        sauce = "Marinara Sauce";
        toppings.add("Grated Reggiano Cheese");
    }
}
