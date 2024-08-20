package ObservablePattern.Observer;

import java.util.Observable;
import java.util.Observer;

public class EmailAlertObserver implements NotificationObserver {
    private String email;

    public EmailAlertObserver(String email) {
        this.email = email;
    }
    @Override
    public void notification() {
        sendEmailAlert(this.email);
    }

    public void sendEmailAlert(String email) {
        System.out.println("Email Alert sent " + email);
    }
}
