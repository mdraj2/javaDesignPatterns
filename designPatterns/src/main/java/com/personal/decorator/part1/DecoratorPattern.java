package com.personal.decorator.part1;

public class DecoratorPattern {

	public static void main(String[] args) {
		Beverage decaf = new Decaf();
		System.out.println(decaf.getDescription());
	}

}
