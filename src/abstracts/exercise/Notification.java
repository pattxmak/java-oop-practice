package abstracts.exercise;

public abstract class Notification {

    private final String recipient;
    private final String message;

    public Notification(String recipient, String message) {

        if (recipient == null || recipient.isBlank()) {
            throw new IllegalArgumentException("Recipient cannot be blank");
        }

        if (message == null || message.isBlank()) {
            throw new IllegalArgumentException("Message cannot be blank");
        }

        this.recipient = recipient;
        this.message = message;
    }

    public final String getRecipient() {
        return recipient;
    }

    public final String getMessage() {
        return message;
    }

    public abstract void send();
}
