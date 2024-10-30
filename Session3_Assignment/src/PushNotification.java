public class PushNotification extends NotificationDecorator{
    public PushNotification(INotifier notifier) {
        super(notifier);
    }

    @Override
    public void SendNotification() {
        super.SendNotification();
        SendPushNotification();
    }

    public void SendPushNotification() {
        System.out.println("Push notification sent.");
    }
}
