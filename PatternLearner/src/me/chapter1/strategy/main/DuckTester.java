package me.chapter1.strategy.main;

import me.chapter1.strategy.Duck;
import me.chapter1.strategy.QuackBehavior;
import me.chapter1.strategy.impl.BlackDuck;

public class DuckTester {

	public static void main(String[] args) {
		
		Duck duck = new BlackDuck();
		duck.quack();
		
		duck.setQuacker(new QuackBehavior() {
			
			@Override
			public void quack() {
				System.out.println("im quacking like crazy duck!");
				
			}
		});
		
		duck.quack();
		
		duck.fly();
		duck.fly();
	}

}
