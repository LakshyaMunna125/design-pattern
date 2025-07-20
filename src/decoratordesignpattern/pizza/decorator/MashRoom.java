package decoratordesignpattern.pizza.decorator;

import decoratordesignpattern.pizza.base.BasePizza;

public class MashRoom extends Topping{

    BasePizza basePizza;

    public MashRoom(BasePizza basePizza){
        this.basePizza=basePizza;
    }
    @Override
    public int cost() {
        return basePizza.cost()+30;
    }
}
