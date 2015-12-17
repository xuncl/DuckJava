package strategy_patterns.quackbehavior;

public class MuteQuack implements QuackBehavior {

	@Override
	public void quack() {
		System.out.println("<silence>");

	}

}
