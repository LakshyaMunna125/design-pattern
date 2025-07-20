package strategy.with;

public class NormalVehicle extends Vehicle{
    public NormalVehicle() {
        super(new NormalDriveCapability());
    }
}
