package abstracts.exercise;

public class NotificationMain {

    public static void main(String[] args) {

        Notification[] notifications = {
                new EmailNotification("pattamax@mail.com", "Welcome to Java Camp", "Traning Java"),
                new SmsNotification("0945682145", "Your OTP is 5555555")
        };

        for (Notification notification : notifications) {
            notification.send();
        }

    }
}
