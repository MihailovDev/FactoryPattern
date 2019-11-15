package com.example.factorypattern.factorymethodimpl.chicago;

import com.example.factorypattern.factorymethodimpl.MethodPizza;

public class ChicagoMediteranianMethodPizza extends MethodPizza {
    ChicagoMediteranianMethodPizza(){
        name = " Chicago Style Sauce and Cheese MethodPizza";
        dough = "dough = Thin Crust Dough";
        sauce = "Marinara Sauce";
        toppings.add("Grated Reggiano Cheese");
    }
}
