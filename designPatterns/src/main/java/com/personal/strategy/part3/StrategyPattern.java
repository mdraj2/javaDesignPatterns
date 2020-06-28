package com.personal.strategy.part3;

public class StrategyPattern {

	public static void main(String[] args) {
		Duck mallardDuck = new MallardDuck();
		mallardDuck.performFly();
		Duck redheadDuck = new RedheadDuck();
		redheadDuck.performFly();
		Duck rubberDuck = new RubberDuck();
		rubberDuck.performFly();
	}

}
