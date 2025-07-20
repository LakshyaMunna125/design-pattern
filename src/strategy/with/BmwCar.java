package strategy.with;

public class BmwCar extends Vehicle{

    public BmwCar(){
        super(new SpecialDriveCapability());
    }
}
