package com.personal.strategy.part3;

public abstract class Duck {

	FlyBehavior flyBehavior;
	QuackBehaviour quackBehaviour;

	public void swim() {
		System.out.println("swimming");
	}

	public void performQuack() {
		quackBehaviour.quack();
	}

	public void performFly() {
		flyBehavior.fly();
	}

	public abstract void display();
}
