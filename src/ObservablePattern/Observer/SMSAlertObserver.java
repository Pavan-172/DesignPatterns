package ObservablePattern.Observer;

import java.util.Observable;
import java.util.Observer;

public class SMSAlertObserver implements NotificationObserver {
    private String phoneNumber;

    public SMSAlertObserver(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public void notification() {
        sendSMSAlert(this.phoneNumber);
    }

    public void sendSMSAlert(String number) {
        System.out.println("SMS Alert sent " + number);
    }
}
