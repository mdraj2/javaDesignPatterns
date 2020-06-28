package com.personal.decorator.part2;

public class Espresso extends Beverage {

	public Espresso() {
		this.description = "Espresso";
	}

	@Override
	public int cost() {
		return 2 + super.cost();
	}

}
