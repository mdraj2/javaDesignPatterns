package com.personal.decorator.part3;

public abstract class CondimentDecorator extends Beverage {
	// note that subclasses that extend this will be getting their own
	// getDescription
	// which is different from the parent type
	public abstract String getDescription();
}
