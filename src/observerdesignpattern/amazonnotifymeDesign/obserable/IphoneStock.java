package observerdesignpattern.amazonnotifymeDesign.obserable;

import observerdesignpattern.amazonnotifymeDesign.observer.Notification;

import java.util.ArrayList;
import java.util.List;

public class IphoneStock implements Stock{
    private int stockCount =0;
    private List<Notification> notifications = new ArrayList<>();
    @Override
    public void subscribe(Notification notification) {
        if(!notifications.contains(notification)){
            notifications.add(notification);
        }
    }

    @Override
    public void unSubscribe(Notification notification) {
        notifications.remove(notification);
    }

    @Override
    public void notifyMe() {
         notifications.forEach(Notification::update);
    }

    @Override
    public void setStockCount(int cnt) {
       stockCount = cnt;
       notifyMe();
    }

    @Override
    public int getStockCount() {
        return stockCount;
    }
}
