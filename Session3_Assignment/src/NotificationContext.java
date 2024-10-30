public class NotificationContext {
    public INotificationStrategy notificationStrategy;
    public NotificationContext(INotificationStrategy notificationStrategy) {
        this.notificationStrategy = notificationStrategy;
    }

    public void notifySender(String message) {
        notificationStrategy.sendNotification(message);
    }
}
