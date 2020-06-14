package com.personal.designPatterns.strategyPatternPart3;

public class RubberDuck extends Duck {

	public RubberDuck() {
		flyBehavior = new FlyNoWay();
		quackBehaviour = new Squeak();
	}

	@Override
	public void display() {
		System.out.println("I am a rubber duck");
	}

}
