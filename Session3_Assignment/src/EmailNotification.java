public class EmailNotification extends NotificationDecorator {

    public EmailNotification(INotifier notifier) {
        super(notifier);
    }

    @Override
    public void SendNotification() {
        notifier.SendNotification();
        SendEmail();
    }

    public void SendEmail() {
        System.out.println("Email sent.");
    }
}
