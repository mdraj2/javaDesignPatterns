package com.personal.strategy.part3;

public class RedheadDuck extends Duck {

	public RedheadDuck() {
		flyBehavior = new FlyWithWings();
		quackBehaviour = new Quack();
	}

	@Override
	public void display() {
		System.out.println("I am a redhead duck");

	}

}
