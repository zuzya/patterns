package me.chapter1.strategy.impl;

import me.chapter1.strategy.QuackBehavior;

public class SimpleQuacker implements QuackBehavior {

	@Override
	public void quack() {
		System.out.println("quck!");
	}

}
