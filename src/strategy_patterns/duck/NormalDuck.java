package strategy_patterns.duck;

import strategy_patterns.flybehavior.FlyWithWings;
import strategy_patterns.quackbehavior.Quack;



public class NormalDuck extends Duck {

	public NormalDuck() {
		display();
		this.fly_behavior = new FlyWithWings();
		this.quack_behavior = new Quack();
	}

	@Override
	public void display() {
		System.out.println("I'm a normal duck, with nothing special!");
		System.out.println();
	}

}
