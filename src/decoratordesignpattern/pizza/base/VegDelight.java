package decoratordesignpattern.pizza.base;

public class VegDelight extends BasePizza{
    @Override
    public int cost() {
        return 60;
    }
}
