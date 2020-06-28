package com.personal.decorator.part1;

public class Decaf extends Beverage {

	public Decaf() {
		this.description = "Decaf";
	}

	@Override
	public int cost() {
		return 2;
	}

}
