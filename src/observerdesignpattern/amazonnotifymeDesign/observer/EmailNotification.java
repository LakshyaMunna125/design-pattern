package observerdesignpattern.amazonnotifymeDesign.observer;

import observerdesignpattern.amazonnotifymeDesign.obserable.Stock;

public class EmailNotification implements Notification{
    private final Stock stock;
    private String email;
    public EmailNotification(String email ,Stock stock){
        this.stock=stock;
        this.email=email;
        stock.subscribe(this);
    }
    @Override
    public void update() {
        sendEmailNotification();
    }

    private void sendEmailNotification(){
        System.out.println("Dear "+ email+ ", product is in stock hurry up!");
    }
}
