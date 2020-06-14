package com.personal.designPatterns.strategyPatternPart1;

public class RubberDuck extends Duck {

	@Override
	public void display() {
		System.out.println("I am a rubber duck");
	}

	@Override
	public void quack() {
		System.out.println("squeak");
	}

	// note that in the example a rubber duck should not be able to fly.
	// this could be override aswell

}
