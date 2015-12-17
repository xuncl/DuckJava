package strategy_patterns.duck;


public class DuckSimulater {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Duck d = new NormalDuck();
		d.performFly();
		d.performQuack();
		
		d = new RocketDuck();
        d.performFly();
        d.performQuack();

	}

}
