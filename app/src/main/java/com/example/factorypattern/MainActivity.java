package com.example.factorypattern;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.factorypattern.abstractfactoryimpl.PizzaStoreAbs;
import com.example.factorypattern.abstractfactoryimpl.nyingredients.NYPizzaStore;
import com.example.factorypattern.factorymethodimpl.MethodPizza;
import com.example.factorypattern.factorymethodimpl.MethodPizzaStore;
import com.example.factorypattern.factorymethodimpl.ny.NYMethodPizzaStore;
import com.example.factorypattern.simplefactoryimpl.Pizza;
import com.example.factorypattern.simplefactoryimpl.PizzaStore;
import com.example.factorypattern.simplefactoryimpl.SimplePizzaFactory;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //simple factory
        // This store uses a factory object to create other objects. It encapsulates object creation
        // in one class and allows to avoid using the new keyword across codebase.

        PizzaStore simpleStore = new PizzaStore(new SimplePizzaFactory());
        Pizza pizza = simpleStore.orderPizza("cheese");

        //factory method
        // This store defines an interface for creating an object and lets the subclass decide
        // which class to instantiate.

        MethodPizzaStore factoryStore = new NYMethodPizzaStore();
        MethodPizza pizza1 = factoryStore.orderPizza("cheese");

        //abstract factory
        // This store creates an instance of NYPizzaStore. The orderPizza() method is called on
        // the NYPizzaStore object. The orderPizza() calls createPizza() from NYPizzaStore.
        // The ingredient factory is chosen and instantiated in the pizzaStoreAbs and passed into the
        // constructor of the each pizza.

        PizzaStoreAbs pizzaStoreAbs = new NYPizzaStore();
        pizzaStoreAbs.orderPizza("cheese");
    }
}
