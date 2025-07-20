package decoratordesignpattern.pizza.base;

public class FarmHouse extends BasePizza{
    @Override
    public int cost() {
        return 100;
    }
}
