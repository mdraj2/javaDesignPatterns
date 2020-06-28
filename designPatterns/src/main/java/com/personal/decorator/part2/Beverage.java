package com.personal.decorator.part2;

public class Beverage {
	public String description;
	public Boolean milk = false;

	public String getDescription() {
		return this.description;
	}

	public boolean hasMilk() {
		if (this.milk == true) {
			return true;
		} else {
			return false;
		}
	}

	public int cost() {
		if (milk) {
			return 2;
		} else {
			return 0;
		}
	}

}
