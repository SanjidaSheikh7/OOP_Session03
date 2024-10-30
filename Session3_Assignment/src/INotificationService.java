public interface INotificationService {
    public void addNotification(INotificationObserver notificationObserver);
    public void removeNotification(INotificationObserver notificationObserver);
    public void notifyNotification();
}
