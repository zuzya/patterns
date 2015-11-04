package me.chapter1.strategy.impl;

import me.chapter1.strategy.Duck;
import me.chapter1.strategy.FlyBehavior;
import me.chapter1.strategy.QuackBehavior;

public class BlackDuck extends Duck{

	public BlackDuck() {
		quacker = new SimpleQuacker();
		flyer = new SimplFlyer();
	}

	@Override
	public void display() {
		System.out.println("me is a simple fckn black duck!");		
	}

	
}
