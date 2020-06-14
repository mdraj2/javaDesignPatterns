package com.personal.designPatterns.strategyPatternPart1;

public abstract class Duck {
	public void quack() {
		System.out.println("quak");
	}

	public void swim() {
		System.out.println("swimming");
	}

	public void fly() {
		System.out.println("fly");
	}

	public abstract void display();
}
