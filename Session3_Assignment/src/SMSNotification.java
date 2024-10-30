public class SMSNotification extends NotificationDecorator {
    public SMSNotification(INotifier notifier) {
        super(notifier);
    }

    @Override
    public void SendNotification() {
        notifier.SendNotification();
        SendSMS();
    }

    public void SendSMS() {
        System.out.println("SMS sent.");
    }
}

