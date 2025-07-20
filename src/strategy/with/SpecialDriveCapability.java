package strategy.with;

public class SpecialDriveCapability implements DriveCapability {
    @Override
    public void drive() {
        System.out.println("special drive capability.");
    }
}
