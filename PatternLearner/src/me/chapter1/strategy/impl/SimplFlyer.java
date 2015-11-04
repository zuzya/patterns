package me.chapter1.strategy.impl;

import me.chapter1.strategy.FlyBehavior;

public class SimplFlyer implements FlyBehavior {

	protected int position = 0;
	
	@Override
	public void fly() {
		
		position++;
		
		System.out.println("moved in 1 step");
		System.out.println("my current position: " + position);
	}

	public int getPosition() {
		return position;
	}

	public void setPosition(int position) {
		this.position = position;
	}

}
