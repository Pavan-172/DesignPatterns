package ObservablePattern;

import ObservablePattern.Observer.EmailAlertObserver;
import ObservablePattern.Observer.NotificationObserver;
import ObservablePattern.Observer.SMSAlertObserver;
import ObservablePattern.Observerable.IphoneStockObservable;
import ObservablePattern.Observerable.StockObservableInterface;

public class StockClient {
    public static void main(String[] args) {

        StockObservableInterface stockObservableInterface = new IphoneStockObservable();

        NotificationObserver emailAlertObserver = new EmailAlertObserver("test@gmail.com");
        NotificationObserver SMSAlertObserver = new SMSAlertObserver("56767765");

        stockObservableInterface.registerObserver(emailAlertObserver);
        stockObservableInterface.registerObserver(SMSAlertObserver);

//        stockObservableInterface.setStock(2);
//        stockObservableInterface.setStock(10);
//        stockObservableInterface.setStock(0);
//        System.out.println(stockObservableInterface.getStock());
//        stockObservableInterface.setStock(10);
        System.out.println(stockObservableInterface.getStock());
        stockObservableInterface.setStock(15);
        System.out.println(stockObservableInterface.getStock());
                stockObservableInterface.setStock(0);
        System.out.println(stockObservableInterface.getStock());
        stockObservableInterface.setStock(10);
    }
}
