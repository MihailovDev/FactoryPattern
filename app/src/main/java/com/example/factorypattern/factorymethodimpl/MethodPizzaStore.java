package com.example.factorypattern.factorymethodimpl;

/**
 * This is an abstract creator class. This contains code the depends on an abstract product(MethodPizza)
 * and it doesn't know which concrete product was produced.
 * A factory method handles object creation and encapsulates it in a subclass. This decouples the
 * code in the superclass from the object creation code in the subclass.
 */
public abstract class MethodPizzaStore {

    public final MethodPizza orderPizza(String type){
        MethodPizza methodPizza;
        methodPizza = createPizza(type); //  Creates methodPizza in a concrete implementation of MethodPizzaStore and NOT in the factory object.
        methodPizza.prepare();
        methodPizza.cut();
        return methodPizza;
    }
    protected abstract MethodPizza createPizza(String type); // This is the factory method that all pizza stores override. This defers instantiation to subclasses.
}
