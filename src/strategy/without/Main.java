package strategy.without;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        /*
           here sport class and specialVehicle class has same algo (behaviour) that results in code duplicate.
         */
        Vehicle vehicle = new SportVehicle();
        vehicle.drive();
        vehicle = new SpecialVehicle();
        vehicle.drive();
    }
}