package com.personal.factory.part1;

public class SimplePizzaFactory {
	public Pizza createPizza(String type) {
		Pizza pizza = null;
		if (type.equals("cheese")) {
			pizza = new CheesePizza();
		} else {
			pizza = new VeggiePizza();
		}
		return pizza;
	}

}
