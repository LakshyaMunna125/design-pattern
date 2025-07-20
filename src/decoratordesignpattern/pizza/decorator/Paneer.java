package decoratordesignpattern.pizza.decorator;

import decoratordesignpattern.pizza.base.BasePizza;

public class Paneer extends Topping{
    BasePizza basePizza;
    public Paneer(BasePizza basePizza){
        this.basePizza=basePizza;
    }
    @Override
    public int cost() {
        return basePizza.cost()+40;
    }
}
