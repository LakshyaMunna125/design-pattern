package observerdesignpattern;

public class Main {

    public static void main(String [] args){
        Subject subject = new WeatherStation();
        subject.setData(45.5f);
        Observer observer = new Phone();
        subject.subscribe(observer);
        subject.setData(35.5f);

    }
}
