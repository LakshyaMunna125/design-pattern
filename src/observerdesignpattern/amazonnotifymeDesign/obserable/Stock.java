package observerdesignpattern.amazonnotifymeDesign.obserable;

import observerdesignpattern.amazonnotifymeDesign.observer.Notification;

public interface Stock {

    void subscribe(Notification notification);

    void unSubscribe(Notification notification);

    void notifyMe();

    void setStockCount( int cnt);

    int getStockCount();
}
