package ObservablePattern.Observerable;

import ObservablePattern.Observer.NotificationObserver;

import java.util.Observer;

public interface StockObservableInterface {
    public void registerObserver(NotificationObserver observer);
    public void removeObserver(NotificationObserver observer);
    public void notifyObservers();
    public void setStock(int stock);
    public int getStock();

}
