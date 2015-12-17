package strategy_patterns.duck;

import strategy_patterns.flybehavior.FlyWithRocket;
import strategy_patterns.quackbehavior.MuteQuack;

public class RocketDuck extends Duck
{
    
    public RocketDuck() {
        display();
        this.fly_behavior =  new FlyWithRocket();
        this.quack_behavior = new MuteQuack();
    }


    @Override
    public void display()
    {

    }

}
