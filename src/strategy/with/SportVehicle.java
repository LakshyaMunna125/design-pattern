package strategy.with;

public class SportVehicle extends Vehicle{

    public SportVehicle(){
        super(new SpecialDriveCapability());
    }
}
