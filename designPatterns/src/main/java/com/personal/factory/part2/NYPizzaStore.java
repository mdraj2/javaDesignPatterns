package com.personal.factory.part2;

public class NYPizzaStore extends PizzaStore {

	@Override
	Pizza createPizza(String type) {
		Pizza pizza = null;
		if (type.equals("cheese")) {
			pizza = new NYStyleCheesePizza();
		} else {
			pizza = new NYStyleVeggiePizza();
		}
		return pizza;
	}

}
