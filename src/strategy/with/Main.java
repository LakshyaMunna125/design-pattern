package strategy.with;

public class Main {

    public static void main(String [] args){
        Vehicle vh = new NormalVehicle();
        vh.drive();
        vh= new SportVehicle();
        vh.drive();
        vh= new SportVehicle();
        vh.drive();
    }
}
