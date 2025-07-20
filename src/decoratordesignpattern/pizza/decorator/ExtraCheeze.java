package decoratordesignpattern.pizza.decorator;

import decoratordesignpattern.pizza.base.BasePizza;

public class ExtraCheeze extends Topping{
    BasePizza basePizza;
    public ExtraCheeze(BasePizza basePizza){
       this.basePizza= basePizza;
    }
    @Override
    public int cost() {
        return basePizza.cost()+20;
    }
}
