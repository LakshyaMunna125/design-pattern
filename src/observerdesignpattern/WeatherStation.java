package observerdesignpattern;

import java.util.ArrayList;
import java.util.List;

public class WeatherStation implements Subject{

    private List<Observer> observerList = new ArrayList<>();
    private float temp;

    @Override
    public void subscribe(Observer observer) {
        if(!observerList.contains(observer))
           observerList.add(observer);
    }

    @Override
    public void unSubscribe(Observer observer) {
        observerList.remove(observer);
    }

    @Override
    public void notifyObservers() {
       observerList.forEach(observer -> observer.update(temp));
    }

    @Override
    public void setData(float temperature) {
        temp=temperature;
        notifyObservers();
    }
}
