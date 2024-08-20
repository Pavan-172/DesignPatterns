package ObservablePattern.Observerable;


import ObservablePattern.Observer.NotificationObserver;

import java.util.*;

public class IphoneStockObservable implements StockObservableInterface {

    List<NotificationObserver> observers = new ArrayList<NotificationObserver>();
    private int stock =0;
    @Override
    public void registerObserver(NotificationObserver observer){
        observers.add(observer);
    };

    @Override
    public void removeObserver(NotificationObserver observer){
        observers.remove(observer);
    };


    @Override
    public void notifyObservers(){
        for(NotificationObserver observer : observers){
            observer.notification();
        }
    };


    @Override
    public void setStock(int newStock){
        if(this.stock == 0 && newStock > 0){
            notifyObservers();
        }
        this.stock = newStock;
    };


    @Override
    public int getStock(){
        return stock;
    };
}
