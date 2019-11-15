package com.example.factorypattern.simplefactoryimpl;

/**
 * This is the client of the factory. It uses SimplePizzaFactory
 * to get instances of pizza.
 */
public class PizzaStore {
    SimplePizzaFactory factory; // a reference to SimplePizzaFactory

    public PizzaStore(SimplePizzaFactory factory){
        this.factory = factory; // passes the factory to the pizza store
    }

    public Pizza orderPizza(String type){
        Pizza pizza;
        pizza = factory.createPizza(type);// uses factory to create a pizza of the passed type. no use of new keyword here.
        pizza.prepare();
        pizza.cut();
        return pizza;
    }
}
