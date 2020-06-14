package com.personal.designPatterns.strategyPatternPart2;

public class RedheadDuck extends Duck implements Flyable, Quakable {

	@Override
	public void display() {
		System.out.println("I am a redhead duck");

	}

	@Override
	public void quack() {
		System.out.println("quack");

	}

	@Override
	public void fly() {
		System.out.println("fly");

	}

}
