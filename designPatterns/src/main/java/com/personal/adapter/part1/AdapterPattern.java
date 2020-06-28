package com.personal.adapter.part1;

public class AdapterPattern {

	public static void main(String[] args) {
		// here you have the ducks being made
		// the types are not coded to interface which is not right but for the sake of
		// the example lets
		// continue
		MallardDuck duck = new MallardDuck();
		WildTurkey turkey = new WildTurkey();
		// now we can adapt this turkey to a duck interface
		// inside this adapter it takes a turkey
		// and the duck interface will execute the methods in the turkey interface.
		Duck turkeyAdapter = new TurkeyAdapter(turkey);

		System.out.println("The Turkey says...");
		turkey.gobble();
		turkey.fly();
		System.out.println("\nThe Duck says...");
		// note that the test duck method is a static method that works because it is
		// upcasting
		testDuck(duck);

		System.out.println("nThe TurkeyAdapter says...");
		testDuck(turkeyAdapter);
	}

	static void testDuck(Duck duck) {
		duck.quack();
		duck.fly();
	}

}
