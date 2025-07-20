package strategy.with;

public class NormalDriveCapability implements DriveCapability{
    @Override
    public void drive() {
        System.out.println("normal drive capability.");
    }
}
