package com.personal.decorator.part1;

public abstract class Beverage {
	public String description;

	public String getDescription() {
		return this.description;
	}

	public abstract int cost();

}
