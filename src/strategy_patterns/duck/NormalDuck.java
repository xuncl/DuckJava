package strategy_patterns.duck;

import strategy_patterns.flybehavior.FlyWithWings;
import strategy_patterns.quackbehavior.Quack;



public class NormalDuck extends Duck {

	public NormalDuck() {
		display();
		FlyWithWings fww = new FlyWithWings();
		fww.age = 2;
		this.fly_behavior = fww;
		
		this.quack_behavior = new Quack();
	}

	@Override
	public void display() {
		System.out.println("I'm a normal duck, with nothing special!");
	}

}
