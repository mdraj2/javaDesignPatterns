package com.personal.designPatterns.strategyPatternPart3;

public class FlyNoWay implements FlyBehavior {

	@Override
	public void fly() {
		System.out.println("I cannot fly");

	}

}
