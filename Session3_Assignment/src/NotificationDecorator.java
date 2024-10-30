public class NotificationDecorator implements INotifier {
    public INotifier notifier;

    public NotificationDecorator(INotifier notifier) {
        this.notifier = notifier;
    }
    @Override
    public void SendNotification() {
        notifier.SendNotification();
    }
}
