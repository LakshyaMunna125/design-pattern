package observerdesignpattern;

public interface Subject {
    void subscribe(Observer observer);
    void unSubscribe(Observer observer);
    void notifyObservers();
    void setData(float temperature);
}
