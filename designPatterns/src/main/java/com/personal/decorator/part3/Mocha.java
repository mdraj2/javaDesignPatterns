package com.personal.decorator.part3;

public class Mocha extends CondimentDecorator {
	public Beverage beverage;

	public Mocha(Beverage beverage) {
		this.beverage = beverage;
	}

	// this comes from the condimentdecorator
	@Override
	public String getDescription() {
		// the advantage of this method as you can see that you can keep stringing
		// if you did not define the description method here then it would not be
		// possible
		// to do this here.
		return beverage.getDescription() + ", Mocha";
	}

	// this comes from the beravage class
	@Override
	public double cost() {
		// TODO Auto-generated method stub
		return .20 + beverage.cost();
	}

}
