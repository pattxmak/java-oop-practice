package abstracts.exercise;

public class SmsNotification extends Notification{

    public SmsNotification(String recipient, String message) {
        super(recipient, message);
    }

    @Override
    public void send() {
        System.out.println("Sending SMS to: " + getRecipient());
        System.out.println("Message: " + getMessage());
    }
}
