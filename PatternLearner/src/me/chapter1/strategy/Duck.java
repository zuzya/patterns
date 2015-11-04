package me.chapter1.strategy;

public abstract class Duck {


	protected QuackBehavior quacker;
	protected FlyBehavior flyer;	
	
	public abstract void display();
	
	public  void quack(){
		quacker.quack();
	}
	
	public  void fly(){
		flyer.fly();
	}
	
	public void setQuacker(QuackBehavior quacker) {
		this.quacker = quacker;
	}

	public void setFlyer(FlyBehavior flyer) {
		this.flyer = flyer;
	}

	


}
