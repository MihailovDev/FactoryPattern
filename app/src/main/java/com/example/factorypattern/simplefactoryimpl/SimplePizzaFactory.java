package com.example.factorypattern.simplefactoryimpl;

/**
 * This is the factory where pizzas are created.
 * This is the only part of the app that refers to concrete MethodPizza classes.
 */
public class SimplePizzaFactory {
    public static Pizza createPizza(String type) {
        Pizza pizza = null;
        if (type.equals("cheese")) {
            pizza = new CheesePizza();
        } else if (type.equals("veggie")) {
            pizza = new VeggiePizza();
        }else if (type.equals("mediteranian")){
            pizza = new MediteranianPizza();
        }
        return pizza;
    }
}
