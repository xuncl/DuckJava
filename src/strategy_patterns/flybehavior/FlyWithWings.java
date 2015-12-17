package strategy_patterns.flybehavior;


public class FlyWithWings implements FlyBehavior {

    public int age =0;
    
    
	@Override
	public void fly() {
		System.out.println("I'm flying with wings!");

	}

}
