package com.personal.decorator.part3;

public class DecoratorPattern {
	public static void main(String[] args) {
		Beverage beverage = new Espresso();
		System.out.println(beverage.getDescription() + " $" + beverage.cost());
		// double mocha
		beverage = new Mocha(beverage);
		beverage = new Mocha(beverage);
		System.out.println(beverage.getDescription() + " $" + beverage.cost());
	}
}
