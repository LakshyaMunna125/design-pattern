package observerdesignpattern;

public class Phone implements Observer{
    private float temperature;
    @Override
    public void update(float temp) {
        this.temperature=temp;
        display();
    }

    private void display(){
        System.out.println("current temp is :"+ temperature);
    }
}
