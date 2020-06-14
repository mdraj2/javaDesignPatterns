package com.personal.designPatterns.strategyPatternPart1;

public class InheritanceExample {

	public static void main(String[] args) {
		Duck mallardDuck = new MallardDuck();
		mallardDuck.display();
		Duck redheadDuck = new RedheadDuck();
		redheadDuck.display();
		Duck rubberDuck = new RubberDuck();
		rubberDuck.display();
	}

}
