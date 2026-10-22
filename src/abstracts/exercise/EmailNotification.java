package abstracts.exercise;

public class EmailNotification extends Notification {

    private String subject;

    public EmailNotification(String recipient, String message, String subject) {
        super(recipient, message);

        if (subject == null || subject.isBlank()) {
            throw new IllegalArgumentException("Subject cannot be blank");
        }

        this.subject = subject;
    }


    @Override
    public void send() {
        System.out.println("Sending email to: " + getRecipient());
        System.out.println("Subject: " + subject);
        System.out.println("Message: " + getMessage());
    }
}
