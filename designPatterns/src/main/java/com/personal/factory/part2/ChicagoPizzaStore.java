package com.personal.factory.part2;

public class ChicagoPizzaStore extends PizzaStore {

	@Override
	Pizza createPizza(String type) {
		Pizza pizza = null;
		if (type.equals("cheese")) {
			pizza = new ChicagoStyleCheesePizza();
		} else {
			pizza = new ChicagoStyleVeggiePizza();
		}
		return pizza;
	}

}
