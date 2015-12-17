package strategy_patterns.duck;

import strategy_patterns.flybehavior.FlyBehavior;
import strategy_patterns.quackbehavior.QuackBehavior;

public abstract class Duck {
	
	FlyBehavior fly_behavior;
	QuackBehavior quack_behavior;
	
	public Duck(){
	}
	
	public abstract void display();
	
	public void performFly(){
		fly_behavior.fly();
	}
	
	public void performQuack(){
		quack_behavior.quack();
	}
	
	public FlyBehavior getFly_behavior() {
		return fly_behavior;
	}

	public void setFly_behavior(FlyBehavior fly_behavior) {
		this.fly_behavior = fly_behavior;
	}

	public QuackBehavior getQuack_behavior() {
		return quack_behavior;
	}

	public void setQuack_behavior(QuackBehavior quack_behavior) {
		this.quack_behavior = quack_behavior;
	}

}
