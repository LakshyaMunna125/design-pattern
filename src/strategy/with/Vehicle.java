package strategy.with;

public class Vehicle {
    private DriveCapability driveCapability;

    public Vehicle(DriveCapability driveCapability){
        this.driveCapability=driveCapability;
    }

    public Vehicle() {
    }

    public void drive(){
        driveCapability.drive();
    }
}
