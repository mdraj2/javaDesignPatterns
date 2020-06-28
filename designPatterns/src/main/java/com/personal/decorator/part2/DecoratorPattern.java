package com.personal.decorator.part2;

public class DecoratorPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Beverage espresso = new Espresso();
		System.out.println(espresso.cost());
		espresso.milk = true;
		System.out.println(espresso.cost());

	}

}
