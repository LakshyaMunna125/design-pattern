package decoratordesignpattern.pizza;

import decoratordesignpattern.pizza.base.BasePizza;
import decoratordesignpattern.pizza.base.FarmHouse;
import decoratordesignpattern.pizza.decorator.ExtraCheeze;
import decoratordesignpattern.pizza.decorator.MashRoom;
import decoratordesignpattern.pizza.decorator.Topping;

public class DriverClass {
    public static void main(String [] args){
        Topping topping = new MashRoom(new ExtraCheeze(new FarmHouse()));
        System.out.println(topping.cost());
    }
}
