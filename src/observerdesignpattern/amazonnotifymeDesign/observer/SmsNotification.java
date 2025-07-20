package observerdesignpattern.amazonnotifymeDesign.observer;

import observerdesignpattern.amazonnotifymeDesign.obserable.Stock;

public class SmsNotification implements Notification{
    private Stock stock;
    private String mobileNumber;

    public SmsNotification(String mobileNumber , Stock stock){
        this.stock=stock;
        this.mobileNumber= mobileNumber;
        stock.subscribe(this);
    }
    @Override
    public void update() {
        sendSmsNotification();
    }


    private void sendSmsNotification(){
        System.out.println("Dear "+ mobileNumber+ ", product is in stock hurry up!");
    }
}
