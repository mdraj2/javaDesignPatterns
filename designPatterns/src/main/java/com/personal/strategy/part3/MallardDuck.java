package com.personal.strategy.part3;

public class MallardDuck extends Duck {

	public MallardDuck() {
		quackBehaviour = new Quack();
		flyBehavior = new FlyWithWings();
	}

	@Override
	public void display() {
		System.out.println("I am a MallardDuck");
	}

}
