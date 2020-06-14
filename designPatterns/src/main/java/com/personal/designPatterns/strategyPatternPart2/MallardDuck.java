package com.personal.designPatterns.strategyPatternPart2;

public class MallardDuck extends Duck implements Flyable, Quakable {

	@Override
	public void display() {
		System.out.println("I am a MallardDuck");
	}

	@Override
	public void fly() {
		System.out.println("flying");

	}

	@Override
	public void quack() {
		System.out.println("quack");

	}

}
