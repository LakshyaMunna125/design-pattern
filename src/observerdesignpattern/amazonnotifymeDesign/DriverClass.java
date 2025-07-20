package observerdesignpattern.amazonnotifymeDesign;

import observerdesignpattern.amazonnotifymeDesign.obserable.IphoneStock;
import observerdesignpattern.amazonnotifymeDesign.observer.EmailNotification;
import observerdesignpattern.amazonnotifymeDesign.observer.SmsNotification;

public class DriverClass {
    public static void main(String [] args){
        IphoneStock iphoneStock = new IphoneStock();
        EmailNotification emailNotification = new EmailNotification("abc@gmail.com",iphoneStock);
        SmsNotification smsNotification = new SmsNotification("9999999999",iphoneStock);
        iphoneStock.setStockCount(10);
    }
}
